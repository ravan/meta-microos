SUMMARY = "Development libraries and headers for lzma-sdk"
DESCRIPTION = "This package contains development libraries and headers for lzma-sdk."
LICENSE = "LGPL-2.1-only"

PV = "26.03"

RPM_NAME = "lzma-sdk-devel-26.03-1.1.aarch64.rpm"
RPM_HASH = "d227732921ae559f4281750a44dd8569264226bd2d1597cd8a8db3d0682d001df86886d8e1f6a954fbc8efac85a06e114f18d69b0d6bdfb2bc9d8efa7ae3fb4b"

RPROVIDES:${PN} += "lzma-sdk-devel \
pkgconfig-lzma-sdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzmasdk26"

inherit rpm
