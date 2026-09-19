SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python314-crontab-1.0.5-1.5.noarch.rpm"
RPM_HASH = "90996b357cf4bf218588fd0c6fef39eed817fa5240c8bdba04a087653758cd21c14d5dc07e58bbb83cab069e494e30e860838664d2958d8ae96c1090699bf059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crontab \
python314-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-pytz"

inherit rpm
