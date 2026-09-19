SUMMARY = "Development files for the GPRS tunnel config library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtpnl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libgtpnl-devel-1.3.3-1.4.aarch64.rpm"
RPM_HASH = "ec66dcc082e0125f1ca342c1645f36fd964dd723337f1f5b644d1b6a11b0e3094dbd26de13d3ef9db2f8d0d1f5f210609fdf5b8cc2f4737b778f75a43a96ae98"

RPROVIDES:${PN} += "libgtpnl-devel \
pkgconfig-libgtpnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtpnl0"

inherit rpm
