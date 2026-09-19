SUMMARY = "Development files for libppd"
DESCRIPTION = "This package contains the development files for libppd."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libppd-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "ed339ababf51b456062c4d338cbe94c9d6e173cdb2ff0e4b4d0bff0f46b0be9ae44e8785a046b56c2d1e43d22fa5eafeb0fe2cb64607bbaf68e8d05dfc47e065"

RPROVIDES:${PN} += "libppd-devel \
pkgconfig-libppd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libppd \
libppd2"

inherit rpm
