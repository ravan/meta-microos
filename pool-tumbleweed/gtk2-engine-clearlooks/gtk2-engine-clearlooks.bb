SUMMARY = "Clearlooks GTK+ 2 Theme Engine"
DESCRIPTION = "The Clearlooks engine was the default theme of GNOME 2 since 2.12. It is \
a modular engine providing multiple styles such as glossy and gummy."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-clearlooks-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "9e037061ff97052ec7e7830603d39c3e8fe4638e3a4719340a7281dcc0d438a76ab2e38d9bdce66d4b43aaba2ac26b9f9e769a6aa43f5699c5850267ef0a9ec2"

RPROVIDES:${PN} += "gtk2-engine-clearlooks \
libclearlooks.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
