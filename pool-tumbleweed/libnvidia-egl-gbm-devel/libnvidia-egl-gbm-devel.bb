SUMMARY = "Development package for libnvidia-egl-gbm"
DESCRIPTION = "The GBM EGL external platform library. \
 \
This package provides headers and libraries required to build software \
using libnvidia-egl-gbm."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "libnvidia-egl-gbm-devel-1.1.3-2.1.aarch64.rpm"
RPM_HASH = "03ad56d951c71ccee5f62b56b6ebcb4b9b04523decc1450308877e7f132128d9b0dc2caf303df23696d5a5c74576a9f663f1bf615ba5123b7860e9c2b2dc469f"

RPROVIDES:${PN} += "libnvidia-egl-gbm-devel"

RDEPENDS:${PN} += "libnvidia-egl-gbm1"

inherit rpm
