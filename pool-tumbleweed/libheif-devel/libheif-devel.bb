SUMMARY = "Devel Package for libheif"
DESCRIPTION = "libheif is a ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
This package contains the header files."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-devel-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "874c262e0f91fe98233e820d954285e28adad4f69721c5f9542661281266bbfdf77cd890da61eff4ec4aa2e2ff8301088cb12aa1cb95103db4faf72105c64367"

RPROVIDES:${PN} += "cmake-libheif \
libheif-devel \
pkgconfig-libheif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libheif1 \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libsharpyuv \
pkgconfig-zlib"

inherit rpm
