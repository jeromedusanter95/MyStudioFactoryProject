# MyStudioFactoryProject

Architecture of your app

the architecture is a MVVM which all the baseClasses were created by me (except the BaseAdapter and BaseItemViewModel which i need to improve).

All the baseClasses are in the module base.

The architecture follows theses rules :

- Domain is independant of Data an Ui.
 - Ui and Data should never know each others.
 - My view (xml/activity/fragment) should never user IModel (Business logic) model
 - All the business objects in my viewModel are private and mapped to uiModel which are exposed to the view
 - If an User's action change the model -> ViewModel will change the model then disptach an action if necessary
 - If an User's action doesn't change the model -> the view will handle by itself the action
 - All the uiModel should be in databinding, observed by the view -> Screen orientations is handle in every cases (except for the dialog, i need to dig into that)
 - SharedViewModel for one feature to not have to passe data betweens fragments.

Choice of libraries

- Retrofit -> Works really fine with api rest and the Adapter factories make the job quite easy to make api calls
- Rx -> I don't know any others frameworks/librairies which can does the job of Rx for asynchronous task (except Coroutines but i have more knwoledge in Rx than Coroutines for now)
 - Statefullayout -> Simple layout container to handle the UiState
- Navigation Jetpack -> They provide an easy way to implement a good navigation (in a Single Activity App) and the viewModel provide by the navGraphProvider is awesome
- Dagger -> Dagger is recommended by Google and the only di framework i really know. My use of dagger is pretty poor for now but i don't work with at all in my current project so...
- Glide -> Really usefull when it comes to dealing with image

Hope you enjoyed the test ! :)
