SUMMARY = "Management library for 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table)."
LICENSE = "LGPL-2.1-only"

PV = "84"

RPM_NAME = "libndctl6-84-1.2.aarch64.rpm"
RPM_HASH = "31b04941502daacfc077e9bf95f8987904c8bc74ebf673f8e3c27843d7d33eb6ac1212b5c569cd413d9d71c7ebd196b8b99876979cbd1eb6543ff38dadc62a72"

RPROVIDES:${PN} += "libcxl.so.1 \
libdaxctl.so.1 \
libndctl.so.6 \
libndctl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libudev.so.1 \
libuuid.so.1"

inherit rpm
