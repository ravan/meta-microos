SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0-or-later"

PV = "0.63.0"

RPM_NAME = "python313-virtkey-0.63.0-10.7.aarch64.rpm"
RPM_HASH = "8b9e20f351ef5ee963f511630a0593c5ecb4e5995fa157f57d4543f0f9d9f66cbbf251160db7f13e30814e00a512e6d38b37ec3c4a845c446acb9f311d63feff"

RPROVIDES:${PN} += "python3-virtkey \
python3.13dist-virtkey \
python313-virtkey \
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
