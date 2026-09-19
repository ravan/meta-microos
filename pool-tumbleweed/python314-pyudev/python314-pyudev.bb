SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.4"

RPM_NAME = "python314-pyudev-0.24.4-1.4.noarch.rpm"
RPM_HASH = "0067272f8fc414024e9761a176900e566d5a1c58d190859235b547e634554b88b1a132f7738f5fb155e73181e5a9cb837c7cba3e8be15b2cca7b3aca08ff6adb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyudev \
python314-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
