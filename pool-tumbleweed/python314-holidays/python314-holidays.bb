SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.103"

RPM_NAME = "python314-holidays-0.103-1.1.noarch.rpm"
RPM_HASH = "29838e1e62641f67025819ee46b423b167eca375fd29abe0341485fdf11e6484c7d8b59e376b79ae58b404a95e36f0519f9eb4b12cb8545bcdc638c1a1a095a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-holidays \
python314-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-python-dateutil"

inherit rpm
