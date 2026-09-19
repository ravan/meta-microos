SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python314-convertdate-2.4.1-1.3.noarch.rpm"
RPM_HASH = "66e5526c8858a2610d7e553b49a0b3d6f1f9fe9a041159631eb51ff9dfa18e2988794fa2bb103ab3ac0f85d6b87729e57a1533aa342a62b4ec4196e14b00c2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-convertdate \
python314-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "python-abi \
python314-PyMeeus"

inherit rpm
