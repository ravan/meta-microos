SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libgd3-2.3.3-6.1.aarch64.rpm"
RPM_HASH = "3fa26fe16aae7e7465be87edfe695ce5d12a3cd9749d2781194d0c5e3e7110658f1e9ea46507bbe525f36d3ee0a232c9ccb5c7977470cc301ea7b32e2c40401a"

RPROVIDES:${PN} += "libgd.so.3 \
libgd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXpm.so.4 \
libavif.so.16 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1"

inherit rpm
