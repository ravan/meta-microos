SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0-or-later"

PV = "0.63.0"

RPM_NAME = "python314-virtkey-0.63.0-10.7.aarch64.rpm"
RPM_HASH = "88fa12975b08bd80c08b362cef5c397166f5fd997dfd8809fe74d8767a5eb8b294d1fea6f78027cb574771de04cc475a6aa6a44aab1c7492b00a1972a7aa8cfc"

RPROVIDES:${PN} += "python3.14dist-virtkey \
python314-virtkey \
python3dist-virtkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libxkbfile.so.1 \
python-abi"

inherit rpm
