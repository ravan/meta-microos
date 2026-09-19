SUMMARY = "Development files for libpkgconf"
DESCRIPTION = "This package provides files necessary for developing applications \
to use functionality provided by pkgconf."
LICENSE = "ISC"

PV = "2.5.1"

RPM_NAME = "libpkgconf-devel-2.5.1-1.5.aarch64.rpm"
RPM_HASH = "bedf6bff000fb4e66c149dedb316c4fb05132b4e58de5a25953d69490ed2dd7dd564d3e4f34ccd149bea094bb78e87c464fc79a0a1fac837d11c6fe603cbbb93"

RPROVIDES:${PN} += "libpkgconf-devel \
pkgconfig-libpkgconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpkgconf7"

inherit rpm
