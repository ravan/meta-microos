SUMMARY = "Python EDBG protocol library"
DESCRIPTION = "Low-level protocol library for communicating with Microchip CMSIS-DAP based debuggers."
LICENSE = "MIT"

PV = "2.24.2.18"

RPM_NAME = "python314-pyedbglib-2.24.2.18-1.3.noarch.rpm"
RPM_HASH = "4582e442e1cd25f2fd904c60d5d08428f0321c4a504373d5bcbebffe19387301653b76324e27fcb6d21b5d831450441cd990a9d2a4a1b4bb814234028ea950c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyedbglib \
python314-pyedbglib \
python3dist-pyedbglib"

RDEPENDS:${PN} += "python-abi \
python314-Cython \
python314-base \
python314-hidapi \
python314-pyserial"

inherit rpm
