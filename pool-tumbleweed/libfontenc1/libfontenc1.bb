SUMMARY = "X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "libfontenc1-1.1.9-1.4.aarch64.rpm"
RPM_HASH = "25a971f17789d9ba7bc4212318e9c3b4cd78bfda0f6c94d6e39da6d5d7974630a970c34373e5fab3bf1f4de576fdad3d344e86aabfb0cf1b2e5566e82518e301"

RPROVIDES:${PN} += "libfontenc.so.1 \
libfontenc1 \
xorg-x11-libfontenc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
