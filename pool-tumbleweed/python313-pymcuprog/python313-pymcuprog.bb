SUMMARY = "Python MCU programmer"
DESCRIPTION = "Python utility for programming various Microchip MCU devices using Microchip CMSIS-DAP based debuggers."
LICENSE = "MIT"

PV = "3.19.4.61"

RPM_NAME = "python313-pymcuprog-3.19.4.61-1.3.noarch.rpm"
RPM_HASH = "0ab7e5f38b6c856d347a1e76189712a17a6816b90e4b1e1e16cf608f7ba59dd7660ad3c91342cea6cc8ad5706d268763390b042beaee6b3508fbf92a3793f63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pymcuprog \
python3-pymcuprog \
python3.13dist-pymcuprog \
python313-pymcuprog \
python3dist-pymcuprog"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-appdirs \
python313-base \
python313-intelhex \
python313-pyserial"

inherit rpm
