SUMMARY = "Development files for the libblockdev-swap plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_swap plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_swap-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "38a7e2b887f14400d22e93f20792d01026de25d3cf6fe46b446ae30a9ff0792c0c50d8b384890c2e1e04b344d9834c48475bd1759f78f3e08b52a6348ef8125d"

RPROVIDES:${PN} += "libbd-swap-devel \
libblockdev-swap-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-swap3 \
libbd-utils-devel"

inherit rpm
