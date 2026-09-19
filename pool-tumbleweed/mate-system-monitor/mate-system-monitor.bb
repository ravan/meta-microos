SUMMARY = "MATE Desktop system monitor"
DESCRIPTION = "Process viewer and system resource monitor for the MATE. This \
package allows you to graphically view and manipulate the running \
processes on your system. It also provides an overview of available \
resources such as CPU and memory."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-system-monitor-1.28.1-1.13.aarch64.rpm"
RPM_HASH = "6d6f417d35c621cb1232b3a21c458ce701e8b294b0282addbb57fc1a31d898fab298187c2fe7ace0c1726afd693e7f50c617a69c903a20df1b4ca54ebc2f9a45"

RPROVIDES:${PN} += "mate-system-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtop-2.0.so.11 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libxml2.so.16 \
polkit"

inherit rpm
