SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk-devel-0.5.0-2.6.aarch64.rpm"
RPM_HASH = "a050ab0d9fcb5e0f798bf68494302d2e0c150b8795a4d8d96df34e9ac8c3126934990878768b267565ad8a6f8afc439ccb41759201910b4d38b968b3388c7659"

RPROVIDES:${PN} += "libexif-gtk-devel \
pkgconfig-libexif-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libexif-devel \
libexif-gtk \
pkgconfig-gtk+-2.0 \
pkgconfig-libexif"

inherit rpm
