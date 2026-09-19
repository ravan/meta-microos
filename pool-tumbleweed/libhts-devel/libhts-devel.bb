SUMMARY = "Header files and libraries for compiling against libhts"
DESCRIPTION = "Header files and libraries of the HTSlib project for compiling against libhts."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libhts-devel-1.21-1.6.aarch64.rpm"
RPM_HASH = "97f0feaf12f0d0f1b2830f29f6234d0132052763e07d35d2d65cf59b91d8f28cbd0499a81e3b9335bc2fbc0bc213313693727cb2773184a35e085053669c73cf"

RPROVIDES:${PN} += "libhts-devel \
pkgconfig-htslib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhts3 \
pkgconfig-bzip2 \
pkgconfig-libcurl \
pkgconfig-liblzma \
pkgconfig-zlib"

inherit rpm
