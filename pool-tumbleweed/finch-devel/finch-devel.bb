SUMMARY = "Headers etc. for finch Stuffs"
DESCRIPTION = "The finch-devel package contains the header files, developer \
documentation, and libraries required for development of Finch \
scripts and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "finch-devel-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "b7ebf6006bb3d59c77cafbe70cb5ce637317efcf20bb14525087431a73e680bbdf6d33973e24bb7fdc924e910c806a1a2f6d979d2bf8696605f74f62979df37a"

RPROVIDES:${PN} += "finch-devel \
pkgconfig-finch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
finch \
glibc-devel \
libpurple-devel \
ncurses-devel \
pkgconfig-glib-2.0 \
pkgconfig-gnt \
pkgconfig-purple"

inherit rpm
