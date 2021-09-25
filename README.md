# Handle Screen Orientation Data Preservation

## Past

- https://www.youtube.com/playlist?list=PLlxmoA0rQ-LyCGSSD_nuPAmXDSR_FU0RR (Episodes 30-34)

### Prevent Activity Restart upon Orientation Change

1. In `manifest.xml` Activity: `android:configChanges="orientation|screenSize|keyboardHidden"`.
2. Then you can also override the `onConfigurationChanged` function.

### Preserve Data upon Orientation Change

Have to override `onSaveInstanceState(Bundle outState)` & `onRestoreInstanceState(Bundle savedInstanceState)`

![](/Illustrations/old_way.png)

## JetPack View Model

- https://www.youtube.com/playlist?list=PLlxmoA0rQ-LyVuVR1LFvpR1K8A0HsIBYx (Section 3)

![](/Illustrations/new_way.png)

But beware of these changes: https://developer.android.com/jetpack/androidx/releases/lifecycle#2.2.0
