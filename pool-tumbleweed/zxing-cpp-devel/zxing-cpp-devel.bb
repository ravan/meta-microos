SUMMARY = "Header files for zxing, a library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides header files to use ZXing in \
other applications."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "3.1.1"

RPM_NAME = "zxing-cpp-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "5b99674bebe7a8ab2accff7d38fc25b2d0fb92f87a5d71be3e4356283c2f7497e13d63b5232e278b86c9d173e9c6ae452b4e0891e5939ef55ae837fb74eede6f"

RPROVIDES:${PN} += "cmake-ZXing \
pkgconfig-zxing \
zxing-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libZXing4"

inherit rpm
