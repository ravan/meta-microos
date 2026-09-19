SUMMARY = "Scaling, colorspace conversion, and dithering library"
DESCRIPTION = "The 'z' image library implements the commonly required image processing \
basics of scaling, colorspace conversion, and depth conversion."
LICENSE = "WTFPL"

PV = "3.0.6+20260720.g1ad1895"

RPM_NAME = "libzimg2-3.0.6+20260720.g1ad1895-1.1.aarch64.rpm"
RPM_HASH = "ad2c320b3d6d64ec8b2cd960d7d1375f89d5d8063dacfc84af0bd0fce410af33aa1d721d5e20039ad5e337eaf59cd25efb53cd301489db979d28584c277c8fe4"

RPROVIDES:${PN} += "libzimg.so.2 \
libzimg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
