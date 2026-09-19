SUMMARY = "Development files for librcd, a charset detection library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librcd."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd-devel-0.1.14-5.5.aarch64.rpm"
RPM_HASH = "e7445129e0f1d3225978f5242017d77b7de2dd23533eff69850e569e88313805e4a639b465c7391d65c980c1d2c8644db383e6eb066d48b5f6a417790bd6ae08"

RPROVIDES:${PN} += "librcd-devel \
pkgconfig-librcd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcd0"

inherit rpm
