SUMMARY = "Development libraries and headers for lzham_codec"
DESCRIPTION = "This package contains development libraries and headers for lzham_codec."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-devel-1_0_stable1-3.9.aarch64.rpm"
RPM_HASH = "3ffe831b436a7511edc106f7a0ffff732de82a34dc8bca7b6804a49d001110ebe22a97c8839a94ac7a725effd91a976c1315eb7fdb403d01dc4766889a745dd5"

RPROVIDES:${PN} += "lzham-codec-devel \
pkgconfig-lzham-codec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lzham-codec-libs"

inherit rpm
