***TASK 1: EXPLORATORY TESTING***

**Charters** 
1.  Explore: Main Page/Balance Screen \
    Resource: 60 min, 1 tester \
    To discover: if the main page works correctly, as the user's first impression will depend on this module
2.  Explore: Compliance functionalities \
    Resource: 60 min, 2 testers \
    To discover: If the application fulfills all the OS requirements and utilises all the features provided by OS           (notifications, AppStore content etc)
3.  Explore: Purchasing the paid version and paid features \
    Resource: 60 min, 2 testers \
    To discover: if the user is able to purchase the paid version of the app correctly
4.  Explore: Settings module \
    Resource: 45 min, 1 tester \
    To discover: if the user can configure the application properly
5.  Explore: New Transfer Module \
    Resource: 45 min, 1 tester \
    To discover: if the user can process credits within the app
6.  Explore: Categories \
    Resource: 30 min, 1 tester \
    To discover: if the user can adjust categories
7.  Explore: Accounts module \
    Resource: 30 min, 1 tester \
    To discover: if the user can manage accounts
8.  Explore: Left-side menu \
    Resource: 30 min, 1 tester \
    To discover: if the user can display accounts and set date range properly
9.  Explore: unforeseen user behavior \
    Resource: 30 min, 1 tester \
    To discover: how the application reacts under unforeseen user's input (rapid tapping, weird gestures etc)
    

The order of above-listed charters reflects also their prioritisation. I would start testing the main page of the app, becuase it is responsible for the good or bad first impression for the user, which might lead to keeping it or removing. Then I would focus on os/compliance testing, which is compability with the OS (in my case iOS), and utilisation of the OS features (ie notifications). Another important feature is the paid version of the app, because we want to be sure, that the user can process properly the transaction and be able to use all the paid features of the product. Next in the queue are other in-app features and some destructive testing in the end.

**Spotted malfunctions**
1. Settings
* Budget mode -> input field starts with 0
* Selecting/Unselecting any particular setting redirects the user to the main screen without any information/confirmation
* Budget mode -> If the budget mode is set, and the user wants to uncheck this option, he gets redirected to the main screen without any information
* Budget mode -> there is no info about the maximum budget amount limit
* Carry over, Future recurring records -> selecting or unselecting this mode redirects to the main screen without any info, the user is not aware of what this functionality do
* Language -> Polish -> ‘Future recurring records’ option is not translated

2. Accounts
* Add + -> Negative balance is displayed in parenthesis, instead of minus sign
* The keyboard  displayed in the New Transfer screen contains calculator options, which is unnecessary
* The difference between transfer and account is not explained, there should be a tooltip
* When the user opes the ‘add account’ screen (by tapping the + button), the keyword is displayed automatically, and then upon trying to add the new account with empty name, the error message is covered by the keyboard

3. Categories
* Some of the icons the user can browse in order to choose a category logo, require the paid version of the app, but those are not indicated in any way
* Missing dot in the last sentence displayed in the confirmation pop-up upon a category deletion
* Disabled category in the categories menu is displayed with an illegible font
* After deleting all the ‘income’ categories, the whole section disappears and the user is not able to add a new ‘income’ category anymore
* Deleting categories is available at all times, however adding new ones requires the paid version - user can unwillingly run out of categories, which basically block the possibility of adding new expenses to the app (CRITICAL BLOCKER)

4. Left Menu
* When the user taps ‘choose date’ button and then tap the year, some years on the list of the years are highlighted in grey - missing explanation
* After submitting several transfers between various account, and then selecting ‘All accounts’ option from this menu, there is only one displayed in the main screen (due to missing tooltips, not intuitive UI in general, the user is probably not sure how this functionality should work)

5. New transfer screen
* Submitting a new transfer is only possible after activating the keyboard by tapping the amount input field, quite unintuitive, missing ‘add’ button in the upper-right corner of the screen

6. The Main Screen, Balance Screen (one hour)
* Some categories in the main screen, that participate 0% in the total expense are reflected in the chart while ones with 2 or 3 % not
* Monefy, All accounts logo (at the top of the main screen) is cropped after returning from a different screen (I.e new transfer screen)

Summary after tests:
The application has poor transitions between screens and also is not intuitive. Due to missing tooltips, is it difficult for the user to get to know the fonctionalities of the core features like accounts or adding expenses. Removing all categories leads to a blocker.
