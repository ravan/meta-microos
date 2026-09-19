SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-client-qemu-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "8fc5fec857ccedd1dfcdf81072cbd0d32666ad9404124cebad7dff19f1e254f1a75e9251548ff39bd0643554fc1c5a61de866c1a09dbebcbb9325246e80201ab"

RPROVIDES:${PN} += "libvirt-client-qemu"

RDEPENDS:${PN} += "/usr/bin/env \
libvirt-libs \
python3-libvirt-python"

inherit rpm
