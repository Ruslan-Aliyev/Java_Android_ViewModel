# Handle Screen Orientation Data Preservation

## Past

- https://www.youtube.com/playlist?list=PLlxmoA0rQ-LyCGSSD_nuPAmXDSR_FU0RR (Ep 30-34)

### Prevent Activity Restart upon Orientation Change

1. In `manifest.xml` Activity: `android:configChanges="orientation|screenSize|keyboardHidden"`.
2. Then you can also override the `onConfigurationChanged` function.

### Preserve Data upon Orientation Change

Have to override `onSaveInstanceState(Bundle outState)` & `onRestoreInstanceState(Bundle savedInstanceState)`

![](/Illustrations/old_way.png)
