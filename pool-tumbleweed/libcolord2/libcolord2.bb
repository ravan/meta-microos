SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "libcolord2-1.4.8-3.1.aarch64.rpm"
RPM_HASH = "f113543703a9c72e33d3d9489424271d8fcbff99d015f8446c3f200215c487956cd65e7c4f9dac6b72ffe48cb181298944c3843d23cc9f90ba81c327c10c28cc"

RPROVIDES:${PN} += "libcolord.so.2 \
libcolord2 \
libcolordprivate.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libudev.so.1"

inherit rpm
