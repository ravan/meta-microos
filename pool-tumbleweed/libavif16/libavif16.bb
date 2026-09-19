SUMMARY = "Shared library from libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the shared library for libavif."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "libavif16-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "386f24bb0e99f4b97999a40a63ec602239260836347b9d23df97b49f5ef345a9143a4e8f4a86d247593c7bfc67914f103ae06dd87b0211c17d7192dc35f192d9"

RPROVIDES:${PN} += "libavif.so.16 \
libavif16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSvtAv1Enc.so.4 \
libaom.so.3 \
libc.so.6 \
libdav1d.so.7 \
libm.so.6 \
librav1e.so.0.8 \
libsharpyuv.so.0 \
libyuv.so.0"

inherit rpm
