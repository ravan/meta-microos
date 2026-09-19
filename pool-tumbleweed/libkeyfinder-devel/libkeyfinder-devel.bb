SUMMARY = "Development files for libkeyfinder"
DESCRIPTION = "The libkeyfinder-devel package contains libraries and header files for \
developing applications that use libkeyfinder."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libkeyfinder-devel-2.2.8-1.5.aarch64.rpm"
RPM_HASH = "07a3cadd9533462dddd03a4c1a505befed68a5601dffbd83ea6cce3a9fe7c98425e02c8789f23d2664b553a8604a749f7a7a40d84cc9fd520f675e40b27dfd8c"

RPROVIDES:${PN} += "cmake-KeyFinder \
libkeyfinder-devel \
pkgconfig-libkeyfinder"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkeyfinder2 \
pkgconfig-fftw3"

inherit rpm
