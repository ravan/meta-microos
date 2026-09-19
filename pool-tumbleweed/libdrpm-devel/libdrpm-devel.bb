SUMMARY = "C interface for the drpm library"
DESCRIPTION = "This package provides a C interface (drpm.h) for the drpm library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libdrpm-devel-0.5.2-1.12.aarch64.rpm"
RPM_HASH = "8c1e3fe2f429517d92829c2fdb27834adae0bb7d981f3f283810ad25314383a02c72d5cc5023008f271bb69481e681f73a7c1ddf4eb4e019086a6da2bfc857b4"

RPROVIDES:${PN} += "drpm-devel \
libdrpm-devel \
pkgconfig-drpm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrpm0"

inherit rpm
