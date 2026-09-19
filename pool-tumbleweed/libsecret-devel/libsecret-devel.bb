SUMMARY = "Development files for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.7"

RPM_NAME = "libsecret-devel-0.21.7-2.4.aarch64.rpm"
RPM_HASH = "83369941346d6d30723c7447b19afff5ef3dcfbe2827838527ee227e0404c138dd586de88aa1642298eb7c914bff8a11ba02547f0917e2e84f0cee24fdf44602"

RPROVIDES:${PN} += "libsecret-devel \
pkgconfig-libsecret-1 \
pkgconfig-libsecret-unstable"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsecret-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libgcrypt \
pkgconfig-libsecret-1 \
typelib-1-0-Secret-1"

inherit rpm
