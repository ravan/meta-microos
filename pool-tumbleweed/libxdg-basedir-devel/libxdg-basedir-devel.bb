SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir-devel-1.2.3-2.5.aarch64.rpm"
RPM_HASH = "56d4f02388bf6aa0261b7d5c658a349da01f8643312cf71f7a47fe1a5bb57dd013d19e9e59cbe7ee5d9089da08bace5f6e8bc5ec4268d8ed06469624542afa8c"

RPROVIDES:${PN} += "libxdg-basedir-devel \
pkgconfig-libxdg-basedir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxdg-basedir1"

inherit rpm
