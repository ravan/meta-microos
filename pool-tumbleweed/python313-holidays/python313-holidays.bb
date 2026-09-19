SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.103"

RPM_NAME = "python313-holidays-0.103-1.1.noarch.rpm"
RPM_HASH = "c864ef673485bbe9cacea5bcf41fe0b8476372255454d9e3c85652ac6f8deffb101befb29bd3320398143e54d69c98148d39d486b1fb2fab045f08c2a2bf6a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holidays \
python3.13dist-holidays \
python313-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-python-dateutil"

inherit rpm
