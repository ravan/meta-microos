SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-zhon-2.1.1-1.9.noarch.rpm"
RPM_HASH = "4e81d8d8c960a85f4201222619c9c74920e5b5a96eadf1626eb978dbfc526b80ba04e4168b4b927c3c81c655f0894777e6dc9d63a4f2d67da8a01498e54d0ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zhon \
python3.13dist-zhon \
python313-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
