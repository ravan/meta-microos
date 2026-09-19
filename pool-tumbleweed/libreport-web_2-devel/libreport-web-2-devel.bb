SUMMARY = "Development headers for libreport-web"
DESCRIPTION = "Development headers for libreport-web"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-web_2-devel-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "73c4510eebaaa0c955e62b7495bfe5c2734685e6769263df7a86fa6f38cdff0156682046766a0aa272d6426a7bdc2c6116af1e01fc54477fff7535aa8d5ff7cc"

RPROVIDES:${PN} += "libreport-web-2-devel \
pkgconfig-libreport-web"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreport-web-2 \
pkgconfig-glib-2.0 \
pkgconfig-json \
pkgconfig-libcurl \
pkgconfig-libreport \
pkgconfig-libxml-2.0 \
pkgconfig-satyr \
pkgconfig-xmlrpc \
pkgconfig-xmlrpc-client"

inherit rpm
