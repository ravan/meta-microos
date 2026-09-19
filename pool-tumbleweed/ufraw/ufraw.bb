SUMMARY = "Application to read and manipulate raw images from digital cameras"
DESCRIPTION = "ufraw is 'The Unidentified Flying Raw'. It is an application to read and \
manipulate raw images from digital cameras. It takes care of the color \
management, handles the Nikon curve formats and has an editor for the tone \
curves. For batch processing of images, the command line can be used."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-0.22-13.8.aarch64.rpm"
RPM_HASH = "215bd7510fdaedb67d3cf255d19639560a95de0b45cef2b086ce4d75493ac329ae8757ebe0f2846c87f3613205e9e52229ad680e5c9e1b3f649ed937b43bf846"

RPROVIDES:${PN} += "ufraw"

RDEPENDS:${PN} += "libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.28 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgomp.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
