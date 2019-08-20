# TimePickerCompact

[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21) 
[![JCENTER](https://img.shields.io/badge/jcenter-1.0-brightgreen.svg?style=flat)](https://bintray.com/bintray/jcenter?filterByPkgName=ru.ifr0z.timepickercompact)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-TimePickerCompact-green.svg?style=flat)](https://android-arsenal.com/details/1/7827)

A library for easy usage of TimePicker on Android API 21+

# Preview

<img src="https://wmpics.pics/di-JLGH.gif" width="250" height="500" />

# Install

`implementation 'com.github.ifr0z:timepickercompact:1.0'`

# Usage

XML:
```
<ru.ifr0z.timepickercompact.TimePickerCompact
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    ... />
```

KT:
```
val customTime = "${time_p.hour}:${time_p.minute}" // set/get hour and minute with support all API
output_time_tv.text = customTime
```

# License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
