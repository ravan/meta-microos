SUMMARY = "Varlink C development files"
DESCRIPTION = "Varlink is an interface description format and protocol for creating APIs. \
This package contains headers for the library."
LICENSE = "MIT"

PV = "24"

RPM_NAME = "libvarlink-devel-24-1.7.aarch64.rpm"
RPM_HASH = "8676f7adcb4ec103211771a49944572c870a45f256964a238e9d1e5ac4a78be455ff69e17baecbec712d48e5851b817af8c8d6eeffd14e68fae6b40d9c9d66e1"

RPROVIDES:${PN} += "libvarlink-devel \
pkgconfig-libvarlink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvarlink0"

inherit rpm
