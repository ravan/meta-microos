SUMMARY = "Touch frame library"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "frame-2.5.0+bzr20160809-4.8.aarch64.rpm"
RPM_HASH = "18c936ba703b392ab206628be0d593f153472ffc84c63716f5392969ce0b0541b4cc1b6306d70689b4c35f7cd456b41e6524df4803729d539ae56fee33f54575"

RPROVIDES:${PN} += "frame \
frame-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libframe.so.6"

inherit rpm
