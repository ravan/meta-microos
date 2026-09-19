SUMMARY = "Library for Support of MNG and JNG Formats"
DESCRIPTION = "This library can handle MNG and JNG formats that contain animated \
pictures. These formats should replace the GIF format."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng2-2.0.3-3.14.aarch64.rpm"
RPM_HASH = "694e25d4153bfdd505444c6b49fa137d81b7dec61e7d152a762794eb0549196c1cd063c956b8351319f606c8e3f1ec64e09ef43380cf8fbe09ab5118c96539a0"

RPROVIDES:${PN} += "libmng.so.2 \
libmng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libz.so.1"

inherit rpm
