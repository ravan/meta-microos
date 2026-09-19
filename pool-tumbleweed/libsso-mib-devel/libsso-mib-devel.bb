SUMMARY = "Development files for libsso-mib"
DESCRIPTION = "Applications can link with this library to get Entra Conditional Access tokens \
for authentication and Single-Sign-On from the Himmelblau stack. \
 \
This package contains the development files for the shared library."
LICENSE = "LGPL-2.1-only"

PV = "0.10.1"

RPM_NAME = "libsso-mib-devel-0.10.1-1.2.aarch64.rpm"
RPM_HASH = "922ce8c8d1e38f21302baca2b87eb4fec7270a10981ad014ddb524395fe37a6a7310537602e010c39778946631609afed6d4c23da61033f2ddf3708945652e9c"

RPROVIDES:${PN} += "libsso-mib-devel \
pkgconfig-sso-mib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsso-mib0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-uuid"

inherit rpm
