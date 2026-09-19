SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.42.2"

RPM_NAME = "libuuid-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "b25dda15f39770e57fbb83247b59b92a3b612d1d0c0e571619b8f7f4f12a9b9a513cafb8fb0199fb38520f270261aae6bdb5bd491275db179263a0b14b82455f"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libuuid1"

inherit rpm
