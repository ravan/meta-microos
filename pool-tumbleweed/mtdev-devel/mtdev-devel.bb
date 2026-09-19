SUMMARY = "Development package for mtdev library"
DESCRIPTION = "This package contains the files needed to compile programs that use mtdev library."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "mtdev-devel-1.1.6-1.20.aarch64.rpm"
RPM_HASH = "03759c93df410d0154b2a03d8f8464cffef8cb4d4700eafc80a5d783d139326c02c756764d6ec187f5c88bf1ddbd3c0a7cd2189e230acc85d7e38ba80d7fcea5"

RPROVIDES:${PN} += "mtdev-devel \
pkgconfig-mtdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmtdev1"

inherit rpm
