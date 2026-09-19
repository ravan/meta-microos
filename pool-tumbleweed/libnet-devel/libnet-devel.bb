SUMMARY = "Devel files for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libnet-devel-1.3-1.11.aarch64.rpm"
RPM_HASH = "68c00415b3884d48b34faf47f76ced50f211f676be3d75395dbe6b554f954de7a1a284b8d4a84c7d5fa5e5a8a5fd6a09cd1ebe49486a2106fe0643e4aa591599"

RPROVIDES:${PN} += "libnet-devel \
pkgconfig-libnet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libnet9"

inherit rpm
