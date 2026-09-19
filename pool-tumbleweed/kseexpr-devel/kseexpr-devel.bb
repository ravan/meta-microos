SUMMARY = "Development files for kseexpr"
DESCRIPTION = "Development headers and libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-devel-4.0.4.0-1.20.aarch64.rpm"
RPM_HASH = "d4bf397b876f8fe3cc2caa6a1585752206a4d2ccbb3a6f9e77795d71f0f4eee22a3a267300033b4c398f11eae7a12adc2268c0cf815a10df652a96ebbb7873f4"

RPROVIDES:${PN} += "cmake-kseexpr \
kseexpr-devel \
pkgconfig-kseexpr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKSeExpr4"

inherit rpm
