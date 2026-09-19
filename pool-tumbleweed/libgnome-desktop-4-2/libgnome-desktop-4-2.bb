SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "libgnome-desktop-4-2-44.5-1.5.aarch64.rpm"
RPM_HASH = "2f38a36e7b752920cf7fc1850da990d6363cf7bcfd3be9b35ea98f9d11d08ef69cc66448fe699ee44543266e8f5c2cf179c340e19d300a37602f291760e705cc"

RPROVIDES:${PN} += "gnome-desktop \
libgnome-bg-4.so.2 \
libgnome-desktop-4-2 \
libgnome-desktop-4.so.2 \
libgnome-rr-4.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3-0-common \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libseccomp.so.2 \
libsystemd.so.0 \
libudev.so.1 \
libxkbregistry.so.0"

inherit rpm
