SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjpegexr shared library"
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "libjpegxr0-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "e398e0273142cd54b680ffae5e0474ca6e8570170915bb1bca049bcadc5504811e773fb32cdb7dc0a735e27cef3efab8d3b4585df0d955e317cd6fd6a57ca5d8"

RPROVIDES:${PN} += "libjpegxr.so.0 \
libjpegxr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
