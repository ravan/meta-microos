SUMMARY = "Development files for phodav"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the files needed for developing software using phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "phodav-devel-3.0-3.13.aarch64.rpm"
RPM_HASH = "93fd402b13df38245e887bca48c24a5e41276e22208dcc05170799c730460970f827dcca9e7e74f118b8abb222dfdd6007ef13c3095e40fb5b3788f75567459d"

RPROVIDES:${PN} += "phodav-devel \
pkgconfig-libphodav-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libphodav-3-0-0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0"

inherit rpm
