SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "minizip-devel-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "70ac459802fb88514efb5b301cad970f521e4bd36643dc4e1cf7635f49569e376e7ef49654960856e3bbb01ebf20410335d76604099561108cf9bc68123c780e"

RPROVIDES:${PN} += "minizip-devel \
pkgconfig-minizip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminizip1 \
pkgconfig \
zlib-devel"

inherit rpm
