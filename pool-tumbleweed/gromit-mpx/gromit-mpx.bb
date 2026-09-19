SUMMARY = "A desktop annotation tool"
DESCRIPTION = "Gromit-MPX is a multi-pointer GTK3 port of the original Gromit desktop annotation tool. \
It enables graphical annotations with several pointers at once and is A LOT faster than \
its predecessor since it uses the XCOMPOSITE extension where available."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "gromit-mpx-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "1febfd150eeafde58aa71d31881ee4a8ef82070b16562b945e28e2bca364ac9a4f87bd62a34a9ffa5ab7385ecb9a7d05f003780477e63368770a325fc8a77123"

RPROVIDES:${PN} += "config-gromit-mpx \
gromit-mpx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblz4.so.1 \
libm.so.6"

inherit rpm
