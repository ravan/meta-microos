SUMMARY = "HEIF/AVIF file format decoder and encoder"
DESCRIPTION = "libheif is an ISO/IEC 23008-12:2017 HEIF and AVIF (AV1 Image File Format) file \
format decoder and encoder. \
 \
HEIF and AVIF are new image file formats employing HEVC (H.265) or AV1 image \
coding, respectively, for the best compression ratios currently possible. \
 \
For AVIF libaom, dav1d, or rav1e are used as codecs. HEIF support is not \
provided."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif1-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "e4fddb9884ab5ca797636144fb9bc9d81ca89e5c50d8baf5afea97f531fe7a7d237dd5f46e65e9c85e299a143fa9d8f689f58f0718b3af34eba9ba57787cc4c7"

RPROVIDES:${PN} += "libheif.so.1 \
libheif1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsharpyuv.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
