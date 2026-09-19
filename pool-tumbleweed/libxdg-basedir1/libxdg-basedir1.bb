SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir1-1.2.3-2.5.aarch64.rpm"
RPM_HASH = "2d36e4536cd8f4bf1b0bc4748cd4332d14b1d0cf2d37601707d8866835edb9cff51454992cf34ae4c368b66f73bf68b3662bd9e1dedd7adbae693564de8b3e1f"

RPROVIDES:${PN} += "libxdg-basedir.so.1 \
libxdg-basedir1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
