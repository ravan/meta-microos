SUMMARY = "Python MCU programmer"
DESCRIPTION = "Python utility for programming various Microchip MCU devices using Microchip CMSIS-DAP based debuggers."
LICENSE = "MIT"

PV = "3.19.4.61"

RPM_NAME = "python314-pymcuprog-3.19.4.61-1.3.noarch.rpm"
RPM_HASH = "61f512d0405f19b04416860c44dfbdfaaa376975dd60fa7c504cba162c7d5850925f26dd0942ab1f5be55f8cbf8b8980ca3a3bfe5a7cacfc8e0ecb22ea4ae40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymcuprog \
python314-pymcuprog \
python3dist-pymcuprog"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-appdirs \
python314-base \
python314-intelhex \
python314-pyserial"

inherit rpm
