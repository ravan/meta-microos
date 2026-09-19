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

RPM_NAME = "python313-pytz-2026.3.post1-1.1.noarch.rpm"
RPM_HASH = "e409e1680b186fe401c7badd9b0e3ed510df6f88f2ec38d84c66eb93a9745f36257f24011497746343ffcc53e3b8898f86724657b16cc5f5d47b761a42c8f3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytz \
python3.13dist-pytz \
python313-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python313-base \
timezone"

inherit rpm
