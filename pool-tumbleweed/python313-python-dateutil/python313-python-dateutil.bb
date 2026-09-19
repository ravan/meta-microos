SUMMARY = "A Python Datetime Library"
DESCRIPTION = "The python dateutil module provides powerful extensions to the standard \
datetime module. \
 \
* Computing of relative deltas (next month, next year, next monday, \
   last week of month, etc.) \
 \
* Computing of relative deltas between two given dates and/or \
   datetime objects \
 \
* Computing of dates based on very flexible recurrence rules, using \
   a superset of the iCalendar specification. Parsing of RFC strings \
   is supported as well. \
 \
* Generic parsing of dates in almost any string format. \
 \
* Timezone (tzinfo) implementations for tzfile(5) format files \
   (/etc/localtime, /usr/share/zoneinfo, etc.), TZ environment \
   string (in all known formats), iCalendar format files, given \
   ranges (with help from relative deltas), local machine timezone, \
   fixed offset timezone, UTC timezone, and Windows registry-based \
   time zones. \
 \
* Internal up-to-date world timezone information based on Olson's \
   database. \
 \
* Computing of Easter Sunday dates for any given year, using Western, \
Orthodox or Julian algorithms."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "2.9.0.post0"

RPM_NAME = "python313-python-dateutil-2.9.0.post0-2.9.noarch.rpm"
RPM_HASH = "7a5dec07f7e11604d3042b34de833bcc5a5eac05b9d458cb9cfa05f1b9bd56c87084fc71659fd4d3c4c446b7b9940389f8af6fccd9ba280e4e241048b54eca24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateutil \
python3-python-dateutil \
python3.13dist-python-dateutil \
python313-dateutil \
python313-python-dateutil \
python3dist-python-dateutil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
