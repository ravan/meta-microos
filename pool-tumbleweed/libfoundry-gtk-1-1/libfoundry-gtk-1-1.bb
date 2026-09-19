SUMMARY = "IDE library and command-line companion tool"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "libfoundry-gtk-1-1-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "d583a69dd09416ccf26d1f7d665d379df7c36a97eb8559ee051f4b91ee87a57aa09010d903ad3d572cab9544330f9a9661429091baa75b91ac4e87c6007168e9"

RPROVIDES:${PN} += "libfoundry-adw-1.so.1 \
libfoundry-gtk-1-1 \
libfoundry-gtk-1.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcmark.so.0.31.1 \
libdex-1.so.1 \
libfoundry-1.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libjson-glib-1.0.so.0 \
libpanel-1.so.1 \
libpango-1.0.so.0 \
libpeas-2.so.0 \
libspelling-1.so.2 \
libtemplate-glib-1.0.so.0 \
libvte-2.91-gtk4.so.0 \
libwebkitgtk-6.0.so.4"

inherit rpm
