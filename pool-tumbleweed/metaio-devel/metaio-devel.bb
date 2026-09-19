SUMMARY = "Development files for libmetaio"
DESCRIPTION = "This package contains the sources and header files needed for developing applications using libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-devel-8.5.1-1.19.aarch64.rpm"
RPM_HASH = "3ca5fb8ce29d9c4d3182d918febc2adfb5394d5fb8ed76935ff55e596309caf20f17f2ca733c1c27bc2ac91d2d48e05bddb86df91530ad2c0d70ecf53198d135"

RPROVIDES:${PN} += "metaio-devel \
pkgconfig-libmetaio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetaio1 \
pkgconfig-zlib"

inherit rpm
