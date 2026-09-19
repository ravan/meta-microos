SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-software-plugin-packagekit-50.4-1.1.aarch64.rpm"
RPM_HASH = "d6908c9b5b251c72e8bc5709e316d17c6e21a0b5b1806e8ca1912b6b9db6efd43e9681e7585edc90259f9ff556f9a56c7794869d7fe7fcf4096b97661abceb24"

RPROVIDES:${PN} += "gnome-software-plugin-packagekit \
libgs-plugin-appstream.so \
libgs-plugin-packagekit.so"

RDEPENDS:${PN} += "PackageKit \
gnome-software \
ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomesoftware.so.23 \
libgobject-2.0.so.0 \
libpackagekit-glib2.so.18 \
libxmlb.so.2"

inherit rpm
