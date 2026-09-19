SUMMARY = "Header files for Avahi's Qt6 bindings"
DESCRIPTION = "Development files for the Qt6 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt6-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "a3e038776b6724a9242d4ac23d04a634c38fbd05ed252a66fd547898545c71e2b9e47620715a381120af17b70caaa8bff74d78a9602a3dbcc47bc0451e8cb46f"

RPROVIDES:${PN} += "libavahi-qt6-devel \
pkgconfig-avahi-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-qt6-1 \
pkgconfig-Qt6Core"

inherit rpm
