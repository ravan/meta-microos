SUMMARY = "Tools for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains tools related to metacity, including an \
utility to test themes and a small application to test window \
managers."
LICENSE = "GPL-2.0-or-later"

PV = "3.56.0"

RPM_NAME = "metacity-tools-3.56.0-1.6.aarch64.rpm"
RPM_HASH = "b9a4117197f7aa4e3c6820575d0e7af1ef648de1c4b95b8b6ef86b503a465d6a46d5f71c0d6be7d7d76e77f3e769cd74170b60bd68acf4a32450cb651d1c263b"

RPROVIDES:${PN} += "metacity-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libmetacity.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1 \
metacity"

inherit rpm
