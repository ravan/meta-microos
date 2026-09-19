SUMMARY = "ASEKey USB Token Driver"
DESCRIPTION = "This package contains a driver for the ASEKey USB Token. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asekey-3.7-6.5.aarch64.rpm"
RPM_HASH = "1131cd028e5cd5d36cf651b6bdee82baba178c22eaaa9c4e20fee7c9a75629194351631e854318dde5cf0fe31e21c202b12725f837f84b3706b74abd718ccf81"

RPROVIDES:${PN} += "libASEKey.so \
pcsc-asekey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
