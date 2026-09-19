SUMMARY = "Small Embeddable HTTP Server Library"
DESCRIPTION = "Headers, pkg-config files, so link and other development files for libmicrohttpd \
(Small Embeddable HTTP Server Library)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.10"

RPM_NAME = "libmicrohttpd-devel-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "a6af3e1c3b326709fe63b4258eb4ae42095a9b5df1360f056b85051802d3ca355711f6443ebe9cd295900d79c3a44e2a28a1e3974b700421591dc2464fa30bef"

RPROVIDES:${PN} += "libmicrohttpd-devel \
pkgconfig-libmicrohttpd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmicrohttpd12 \
pkgconfig \
pkgconfig-gnutls"

inherit rpm
