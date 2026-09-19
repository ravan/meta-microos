SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python313-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-3.7.aarch64.rpm"
RPM_HASH = "9b9d8f979a448ce2a259844435429de290d84672d57cb7a92285b0a0eaea38263cce131d6ec92e08e8b8c2b9eb6fd42d452261a56d9d1af66c165a9772dfdc80"

RPROVIDES:${PN} += "pybluez \
python3-pybluez \
python3.13dist-pybluez \
python313-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
