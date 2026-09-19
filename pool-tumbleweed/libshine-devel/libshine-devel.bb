SUMMARY = "Development files for libshine, an MP3 encoding library"
DESCRIPTION = "The libshine-devel package contains libraries and header files for \
developing applications that use libshine."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine-devel-3.1.1-2.5.aarch64.rpm"
RPM_HASH = "a1adcea9ce51124f416b141cd4306fc685e25371e0791fda5e96a2d0121c5fac2342bc95b9ca278651691713272fcc4d70cdf85799a6583a8ee3e5f2a56a447a"

RPROVIDES:${PN} += "libshine-devel \
pkgconfig-shine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshine3"

inherit rpm
