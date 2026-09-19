SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko') \
* Russian ('ru') \
* Arabic ('ar') \
* Turkish ('tr')"
LICENSE = "BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python313-emoji-2.15.0-1.4.noarch.rpm"
RPM_HASH = "d21e14a744edba6fb59471a68adb7e2103b716ec58ed2af9ed03189489c7f2066d863a10d6a6c4261f16a7c11985f9763f999ee9f279fd25b483580b4188ba18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji \
python3.13dist-emoji \
python313-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
