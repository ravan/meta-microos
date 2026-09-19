SUMMARY = "a Gregorian to Jalali and inverse date convertor"
DESCRIPTION = "a Gregorian to Jalali and inverse date convertor"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "python313-jalali-core-1.0.0-1.9.noarch.rpm"
RPM_HASH = "835743ac4a27ff388df5776d1a1e0553cad195f6daa2edd41564ccf661fa9e81a555c0524d22df3107073b0ab0fca7d8b8ce978485b350fd4cf33d95edec7d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jalali-core \
python3.13dist-jalali-core \
python313-jalali-core \
python3dist-jalali-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
