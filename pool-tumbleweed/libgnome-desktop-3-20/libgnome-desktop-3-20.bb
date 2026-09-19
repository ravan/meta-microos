SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "libgnome-desktop-3-20-44.5-1.5.aarch64.rpm"
RPM_HASH = "36bbb6904ba9eefae8c05ad0f978c01cbcc42d4c8706191753fb3019470fa253fb7a891c92ec334d5e825f8cad28774bf20caf0e96a959505ebb66120595afc3"

RPROVIDES:${PN} += "gnome-desktop \
gnome-version \
libgnome-desktop-3-20 \
libgnome-desktop-3.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3-0-common \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libseccomp.so.2 \
libsystemd.so.0 \
libudev.so.1 \
libxkbregistry.so.0"

inherit rpm
