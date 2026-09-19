SUMMARY = "Development files of libxapp"
DESCRIPTION = "The libxapp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libxapp."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.2"

RPM_NAME = "libxapp-devel-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "f23c96ec9e33395bd373f5e5874ba2a30dfda506f13c0f594c627a7705bd2bffb0b73f3d57e378fe54ba461da95e8cc98f314ef7472c58616b2a76ee87d02d20"

RPROVIDES:${PN} += "libxapp-devel \
libxapp-gtk3-module.so \
pkgconfig-xapp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxapp.so.1 \
libxapp1 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgnomekbdui \
pkgconfig-x11 \
pkgconfig-xkbfile \
typelib-1-0-XApp-1-0"

inherit rpm
