SUMMARY = "Plugins for the Linux kernel trace event library"
DESCRIPTION = "This package provides plugins for the libtraceevent library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.9.0"

RPM_NAME = "libtraceevent1-plugins-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "c016ede1afc13192ed6a85c33d96b27886be423938a66b166449ac863dd6f9050a05db3bd4166ac06627517aacfc2a8138b54ce969508f3f1fca41c601004c49"

RPROVIDES:${PN} += "libtraceevent1-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtraceevent1"

inherit rpm
