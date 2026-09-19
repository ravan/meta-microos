SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python313-convertdate-2.4.1-1.3.noarch.rpm"
RPM_HASH = "9bc7ea732099dec5c2b65ab9c6b1c1f2534701f82f87d6c3b5d3ae873a4b68d8badc209c1abb782da1a9383d42bb3937eed0f2393c7b43de5befc7b1e2e60d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-convertdate \
python3.13dist-convertdate \
python313-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "python-abi \
python313-PyMeeus"

inherit rpm
