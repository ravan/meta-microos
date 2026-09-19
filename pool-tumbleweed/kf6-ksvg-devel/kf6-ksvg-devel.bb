SUMMARY = "Development Files for the ksvg framework"
DESCRIPTION = "Development Files for the ksvg framework."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ksvg-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "badf68100f9e3b4aa41b1cd111e26104893c6d66c14c90ce9fe11e280f0e2f12ddbf0ce20731ec95830760eba25b202364750d1d7ef89cd5430b80b7210a431a"

RPROVIDES:${PN} += "cmake-KF6Svg \
kf6-ksvg-devel"

RDEPENDS:${PN} += "libKF6Svg6"

inherit rpm
