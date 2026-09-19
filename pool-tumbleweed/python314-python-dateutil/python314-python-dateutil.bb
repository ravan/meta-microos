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

RPM_NAME = "python314-python-dateutil-2.9.0.post0-2.9.noarch.rpm"
RPM_HASH = "fa138760a5896160d1ce807f6c0ad09565924f452a8defb65ceb8c53123327d978f252538dbf646edd061a72a237ac0c79737ff33998b01c720093752c84a8f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-dateutil \
python314-dateutil \
python314-python-dateutil \
python3dist-python-dateutil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
