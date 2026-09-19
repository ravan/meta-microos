SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd-devel-3.28.1-1.15.aarch64.rpm"
RPM_HASH = "697bc3f890303293292205704593a27c8bbea4776bb320ffd731e3927d95c68f0b33e6f31488c87831bd797b8799938f4c52a677e8a0185d3cde159c1456f7b2"

RPROVIDES:${PN} += "libgnomekbd-devel \
pkgconfig-libgnomekbd \
pkgconfig-libgnomekbdui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnomekbd-tools \
libgnomekbd8 \
pkgconfig-gdk-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgnomekbd \
pkgconfig-libxklavier \
pkgconfig-x11 \
typelib-1-0-Gkbd-3-0"

inherit rpm
