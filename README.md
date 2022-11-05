# HNG9_Stage2_task
HNG stage2 task
<h1 align="center">Resume App</h1>
  This is a mobile version of my resume or what would be my resume, **Note** not all the details here are accurate.
  
  ## Architecture
  - Since this app codebase isnt quite large MAD architecture patterns were nnot implemented, the main files can be found in [Main](https://github.com/J-cart/HNG9_Stage2_task/tree/master/app/src/main/java/com/tutorial/hng9_stage2_task), all libraries implemented is in the [build gradle](https://github.com/J-cart/HNG9_Stage2_task/blob/master/app/build.gradle)
            the layouts and other are also in [Resources](https://github.com/J-cart/HNG9_Stage2_task/tree/master/app/src/main/res).
            
 - Design: [Dribble](https://dribbble.com/shots/14436103-Resume-App) and[Skydoves pokedex github](https://github.com/skydoves/Pokedex) were referenced.
  
## Libraries and Tech stack
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based.
- Jetpack
  - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
  - ViewBinding: Binds UI components in your layouts to data sources in your apps programmatically.
- [Material-Components](https://github.com/material-components/material-components-android): Material design components for building ripple animation, and CardView.
- Custom Views
  - [ProgressView](https://github.com/skydoves/progressview): A polished and flexible ProgressView, fully customizable with animations.

## Download
You can download the latest APK from [Releases](https://github.com/J-cart/HNG9_Stage2_task/tree/master/app/release), also for Appetize.io [App](https://appetize.io/app/byunayjlmkxtqyxtk2bbyiuus4?device=pixel4&osVersion=11.0&scale=75)


## Features to be added
- [ ] Dynamically adding data without hardcoding the values
- [ ] Language Localization
- [ ] Resume pdf download 

## Side notes
I had issues with determining how the UI should look, but after doing a lot of search I settled with picking some parts of the designs i referenced
also with the dark mode, I couldn't get the exact styling and theming for the app. But I found a work around which worked.
