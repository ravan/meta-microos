SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpeople-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "fb0028b362512e2fa85a22c10cba4b40f14605ef1489b8295391e64398942603879c99efa41437ba31f8ae84cd7d625282afa46e6d99042e5ad4cfdded060663"

RPROVIDES:${PN} += "cmake-KF6People \
kf6-kpeople-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6People6"

inherit rpm
