SUMMARY = "Development files for libndctl"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table). \
 \
The ndctl-devel package contains libraries and header files for \
developing applications that use ndctl."
LICENSE = "LGPL-2.1-only"

PV = "84"

RPM_NAME = "libndctl-devel-84-1.2.aarch64.rpm"
RPM_HASH = "7b1cf645bd3b3c1601c8f26005ed7c807149e01cecbd86b2e231eed5666ea53017e4dcb15c9a8a3cfb118359a3ae046e5ba38f70438106b797e31bc288e773d7"

RPROVIDES:${PN} += "libndctl-devel \
pkgconfig-libcxl \
pkgconfig-libdaxctl \
pkgconfig-libndctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndctl6"

inherit rpm
