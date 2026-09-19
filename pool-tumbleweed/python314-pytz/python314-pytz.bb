SUMMARY = "World timezone definitions, modern and historical"
DESCRIPTION = "pytz - World Timezone Definitions for Python \
pytz brings the Olson tz database into Python. This library allows \
accurate and cross platform timezone calculations using Python 2.4 \
or higher. It also solves the issue of ambiguous times at the end \
of daylight savings, which you can read more about in the Python \
Library Reference (``datetime.tzinfo``). \
 \
Amost all of the Olson timezones are supported."
LICENSE = "MIT"

PV = "2026.3.post1"

RPM_NAME = "python314-pytz-2026.3.post1-1.1.noarch.rpm"
RPM_HASH = "b1e642b8ff5d0faa1d5d11b4dc9948703badc5a33f789305ba191d354eda770c466bcc9aa27a2d6e983b1dc7ead9e00d6282b459a5d1efe02e5c2f3f45aa8853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytz \
python314-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python314-base \
timezone"

inherit rpm
