SUMMARY = "Core utility library for LXQt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt-2.4.0-2.2.aarch64.rpm"
RPM_HASH = "240d751639beba3d93455ed34d08ccb5ffbf0639357cf226dac1d0098c48a55a3f88cf965ef9f0026f5650b13bdf838cbe8c22d3cb6e6b5033d193999df2116a"

RPROVIDES:${PN} += "liblxqt \
liblxqt-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pkexec"

inherit rpm
