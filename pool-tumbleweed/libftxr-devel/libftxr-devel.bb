SUMMARY = "Development files for libftxr"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxr."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libftxr-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "043447efbdb515afd7d228fd25381f0878016b57ca091bdc0dbfd65a7b60c5f6fdcc2f5b5e5ddbb59fbe7f1dd843ff60a36bfdde92b6837e619970aa8907e2fb"

RPROVIDES:${PN} += "libftxr-devel \
pkgconfig-libftxr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxr1"

inherit rpm
