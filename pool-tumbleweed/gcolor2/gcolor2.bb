SUMMARY = "Simple color selector"
DESCRIPTION = "Gcolor2 is a GTK2 color selector to provide a quick and easy way to find \
colors for whatever task is at hand. Colors can be saved and deleted as well."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "gcolor2-0.4-7.5.aarch64.rpm"
RPM_HASH = "53ac1cb3a71042412b7e88c1982e8af2183be585f71e2de9da5470701514b75bcc2265dff9bdf12307a3c8eef1cbdd044abe9771f12393d21bb24e89953fc570"

RPROVIDES:${PN} += "gcolor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
