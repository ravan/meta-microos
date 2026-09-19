SUMMARY = "GNOME Keyboard tools"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides various binaries and conversion tools for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "gnomekbd-tools-3.28.1-1.15.aarch64.rpm"
RPM_HASH = "2b96bb7819370454f611c83bc6d1bc13151ec5a406e466436759f868c5fac31b9f4fea209133b83bd27f64a478b7c720d994483ac2fce5cf10fa760989b086e2"

RPROVIDES:${PN} += "gnomekbd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxklavier.so.16"

inherit rpm
