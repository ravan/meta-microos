SUMMARY = "Development package for aquamarine"
DESCRIPTION = "Aquamarine is a very light linux rendering backend library. It \
provides basic abstractions for an application to render on a Wayland \
session (in a window) or a native DRM session. \
 \
This package contains development files necessary to build against \
aquamarine."
LICENSE = "BSD-3-Clause"

PV = "0.15.0"

RPM_NAME = "aquamarine-devel-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "3339fb1794d6a278858ae0bc0381f8b09124f3f531259d71f564127992d646a0724764f40b69632a056b88843e02c267527d74041999e6293729e510a590ec9d"

RPROVIDES:${PN} += "aquamarine-devel \
pkgconfig-aquamarine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaquamarine14"

inherit rpm
