SUMMARY = "Development files of GNT"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces. \
 \
The GNT development package includes the header files, libraries, \
and development tools necessary for compiling and linking \
applications which will use GNT."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.4"

RPM_NAME = "libgnt-devel-2.14.4-1.10.aarch64.rpm"
RPM_HASH = "b051dbdd5005204a865e23f1a0892054fc8e80415e61eaef9eb00369efd56c69a009ed4c4cf8c645c6f2958e7a77246db27548bba2eca0b2e46aeea032539f82"

RPROVIDES:${PN} += "libgnt-devel \
pkgconfig-gnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnt.so.0 \
libgnt0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
