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

RPM_NAME = "python314-emoji-2.15.0-1.4.noarch.rpm"
RPM_HASH = "9787188143d638f8a7235ee71887a2b4a3c022212232df3434c753c7fc5e28ba4b3f4c875a08d1f404f45a19c9207dd526dac35e6b5d19f8b1d8f48666dd18f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-emoji \
python314-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
