SUMMARY = "Library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides a C++ implementation."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "3.1.1"

RPM_NAME = "libZXing4-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "fe31e7e1752d4a0fd08825fa6c61c2e2cec4063cb0e755d222acdabb911cad6cdff5c817028d27ec8034ada4ac0cab878b1345fd973b005fb3a498b7ceebde7a"

RPROVIDES:${PN} += "bundled-zint \
libZXing.so.4 \
libZXing4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
