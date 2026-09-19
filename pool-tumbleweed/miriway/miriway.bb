SUMMARY = "Simple Wayland compositor built on Mir"
DESCRIPTION = "Miriway is a starting point for creating a Wayland based \
desktop environment using Mir."
LICENSE = "GPL-3.0-only"

PV = "26.06.1"

RPM_NAME = "miriway-26.06.1-1.2.aarch64.rpm"
RPM_HASH = "aeab7666e49368cb1df5ead9ac92cce976e06f832817bcd077a26c97be47404f3ed1de444ad4c64f09af047620b2c044460457cec21052f5776327b704af8e51"

RPROVIDES:${PN} += "config-miriway \
miriway"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
inotify-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmiral.so.7 \
libmircore.so.2 \
libmirwayland.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxkbcommon.so.0 \
xkeyboard-config \
xwayland"

inherit rpm
