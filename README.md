# LifeCycleAware
This is simple android/Kotlin application to demonstrate Lifecycle-Aware components.

Sometimes we want to show the user an alert when somethings wrong or we just need to give some extra info, For example;
Ask the user if he is sure he wanna leave the app.
This can be achieved with the following code (runs inside activity):

AlertDialog.Builder(this)</br>
  .setMessage("Are you sure you want to exit?")</br>
  .setCancelable(false)</br>
  .setPositiveButton("Yes", object:DialogInterface.OnClickListener() {</br>
    fun onClick(dialog:DialogInterface, id:Int) {</br>
      this@YourActivity.finish()</br>
    } })</br>
  .setNegativeButton("No", null)</br>
  .show()</br>
  
This works fine, but there is one annoying issue, If user clicks home button while dialog displayed, 
and go back to the app, the dialog will still be there. Now your user experience is seeing a question about 
getting out of the app while he just went in.
To avoid this case, I found an easy solution by making my modal lifecycle aware.
