SUMMARY = "Development files for libnpupnp"
DESCRIPTION = "The libnpupnp-devel package contains libraries and header files for \
developing applications that use libnpupnp."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libnpupnp-devel-6.3.0-1.3.aarch64.rpm"
RPM_HASH = "fabbf69314b8f850a58d364b4f7cc89f2957236730fc9f71cd7aa5dd9d17cfc1d85169d4e5269c16e42a5f84726d7e0b2725ac94c66f016f065459edc38e8dc1"

RPROVIDES:${PN} += "libnpupnp-devel \
pkgconfig-libnpupnp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnpupnp13 \
pkgconfig-libcurl \
pkgconfig-libmicrohttpd"

inherit rpm
