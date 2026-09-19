SUMMARY = "GNOME Terminal"
DESCRIPTION = "This package provides the GNOME terminal emulator application. \
 \
GNOME Terminal uses an architecture with a background process \
managing all open terminal windows, which is beneficial to \
memory consumption."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.60.0"

RPM_NAME = "gnome-terminal-3.60.0-1.2.aarch64.rpm"
RPM_HASH = "c4bfbf49faf7fae7a3d1d54ff5cee09253b05c3321e6d514d6832677dd4fac499454c3749a10192f64a995b2a97f99cd8b91853f6c944ed27151717182579ad0"

RPROVIDES:${PN} += "gnome-terminal"

RDEPENDS:${PN} += "filesystem \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libvte-2.91.so.0"

inherit rpm
