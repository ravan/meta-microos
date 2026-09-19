SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-devel-static-25.11.3-1.1.aarch64.rpm"
RPM_HASH = "6e130adbce407656943bf6de8762af1c39ddb1310a1dff99ba4277f6f8851e9ad6cde621fabb9e453fa9b9bbf3477031254a573bd9c4fb1af688a2a691bdf40b"

RPROVIDES:${PN} += "dpdk-devel-static \
dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
