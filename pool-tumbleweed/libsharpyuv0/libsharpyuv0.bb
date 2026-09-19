SUMMARY = "Library for sharpening YUV option in WebP"
DESCRIPTION = "Library that provides the sharpening YUV option for better WebP images."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libsharpyuv0-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "74934c9b3f17dca2d948bfe57f3ddd31cc6773e6a51bdb1e4d7621ae41567e9aae237d1cd051efa4eceb1ee81f7fd5b63b6b0144ed5668d422f8a60b319af6f6"

RPROVIDES:${PN} += "libsharpyuv.so.0 \
libsharpyuv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
