SUMMARY = "Common data files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package contains data files used by libgnome-dekstop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "libgnome-desktop-3_0-common-44.5-1.5.aarch64.rpm"
RPM_HASH = "4e1cab51ddea7429018a1c01cd1be1a14f3fd6fbc0c191a027530aad0bb3b3ec017b6cee04d39ea0e81ad775396caa706d35a429642cdbb9ac2b93d5178b80fc"

RPROVIDES:${PN} += "libgnome-desktop-3-0-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
