SUMMARY = "Python 3 bindings for newt"
DESCRIPTION = "The python3-newt package contains the Python 3 bindings for the newt library \
providing a python API for creating text mode interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "python3-newt-0.52.25-2.1.aarch64.rpm"
RPM_HASH = "f59ad64981339904d191bde1969ddbb6f1655e485a96e0fbdb9b30f299752ce7f0b612a8b672dbf876a1e7a4b37ede5cf3eb5f66088e55801b20e0c604bf4e8f"

RPROVIDES:${PN} += "python3-newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnewt.so.0.52 \
newt \
python-abi"

inherit rpm
