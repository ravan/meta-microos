SUMMARY = "Development files for nghttp2"
DESCRIPTION = "Development files for usage with libnghttp2, which implements \
Hypertext Transfer Protocol version 2."
LICENSE = "MIT"

PV = "1.70.0"

RPM_NAME = "libnghttp2-devel-1.70.0-1.1.aarch64.rpm"
RPM_HASH = "38731927a5d14f1d9f19112b3ea745881bc66dbb00751d1442f9c3dce3e21bda832d80f754ca0e63994c0c227cffd628164b3712cfee562aeeb86cdb28f32b5b"

RPROVIDES:${PN} += "libnghttp2-devel \
nghttp2-devel \
pkgconfig-libnghttp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnghttp2-14"

inherit rpm
