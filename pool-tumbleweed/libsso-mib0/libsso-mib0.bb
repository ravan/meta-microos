SUMMARY = "Shared library for SSO with Entra via Himmelblau"
DESCRIPTION = "Applications can link with this library to get Entra Conditional Access tokens \
for authentication and Single-Sign-On from the Himmelblau stack. \
 \
This package contains the shared library."
LICENSE = "LGPL-2.1-only"

PV = "0.10.1"

RPM_NAME = "libsso-mib0-0.10.1-1.2.aarch64.rpm"
RPM_HASH = "d17b6972a22d880432074ee30d7c0dbed674f52a6b98c331e9f0e71cc3f5458ca4f1d8c7265f97473ce0813e2904cef7faf372591c003ce9c414231896b59f15"

RPROVIDES:${PN} += "libsso-mib.so.0 \
libsso-mib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libuuid.so.1"

inherit rpm
