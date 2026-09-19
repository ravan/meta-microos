SUMMARY = "Development files for libisds"
DESCRIPTION = "The libisds-devel package contains libraries and header files for \
developing applications that use libisds."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds-devel-0.11.2-2.12.aarch64.rpm"
RPM_HASH = "b72f65081813991f8f9c060b3b827a63eaa4c76acab4b0a0da723db3b50269a9c08f0045a07104a63bf0813ee26d5e4d137a77fb3f315098172b4bff77262586"

RPROVIDES:${PN} += "libisds-devel \
pkgconfig-libisds"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisds5 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
