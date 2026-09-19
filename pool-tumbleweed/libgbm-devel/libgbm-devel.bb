SUMMARY = "Development files for the EGL API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd. \
 \
This package provides the development environment for compiling \
programs against the GBM library."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libgbm-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "cb404bc6880346916b1d3ae152a72e3dea7538b1bf98429429abedafd1e7c2a5c53d1e67051d735fe69ef10c1576a84d92a3238eb0f220a07de05e4d205cc951"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
