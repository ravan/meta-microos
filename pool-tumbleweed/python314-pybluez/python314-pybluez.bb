SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python314-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-3.7.aarch64.rpm"
RPM_HASH = "0f40baf3464a33656f7f7a01d6914f6e7a44dabb9d73473b625945135d22287444568b8ed5003ff29bfee69425b64860ffa18952af7d22345db8ecd90152ea06"

RPROVIDES:${PN} += "pybluez \
python3.14dist-pybluez \
python314-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
