SUMMARY = "Vector-Optimized Library of Kernels"
DESCRIPTION = "This package provides the VOLK shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "libvolk3_3-3.3.0-1.5.aarch64.rpm"
RPM_HASH = "60d8df0a813cfbe0d8e43e72a234b3f2eb0cabe1f3b808b5a4a7cb8af3845968d0900dd2c04ac61a945271f096266594ef511abed2c012919557bc8e327015a6"

RPROVIDES:${PN} += "libvolk.so.3.3 \
libvolk3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
