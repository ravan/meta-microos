SUMMARY = "HDHomeRun library"
DESCRIPTION = "Development libraries needed to build applications with libhdhomerun."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun-devel-20190621-2.11.aarch64.rpm"
RPM_HASH = "751fc3e18e046fd963d510c7bf957e5f3cf0fdfe5fb9dc6426e6adf636cb99b228074f71103399082531ddfc24f988aacfdb5428b69b9c9b007800b60a486491"

RPROVIDES:${PN} += "libhdhomerun-/usr/include/libhdhomerun/hdhomerun.h \
libhdhomerun-devel"

RDEPENDS:${PN} += "libhdhomerun2"

inherit rpm
