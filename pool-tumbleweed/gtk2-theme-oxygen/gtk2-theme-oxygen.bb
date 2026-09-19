SUMMARY = "Oxygen GTK 2.x Theme"
DESCRIPTION = "Oxygen-Gtk2 is a port of the KDE Oxygen widget theme to Gtk 2.x. \
 \
It's primary goal is to ensure visual consistency between Gtk-based \
and Qt-based applications. A secondary objective \
is to also have a stand-alone nice looking gtk theme that would \
behave well on other Desktop Environments. \
 \
This package contains the Oxygen Gtk 2.x theme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.6"

RPM_NAME = "gtk2-theme-oxygen-1.4.6-7.6.aarch64.rpm"
RPM_HASH = "dedf69389810bcdf9d45bc3c803cf14ec09c66941874edc8bf1ad7b89c72280550ce89168066ce19b14dbf0102541c190bed1580abce1b14cbb82c3e3bf3569f"

RPROVIDES:${PN} += "gtk2-theme-oxygen \
oxygen-gtk2"

RDEPENDS:${PN} += "gtk2-engine-oxygen \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
