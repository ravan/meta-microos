SUMMARY = "Development files and headers for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides development files and headers needed to build \
packages against openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "openconnect-devel-9.21-1.3.aarch64.rpm"
RPM_HASH = "31001a1932720f5c73eeeb19738507c67f782509765a5621b708e8252f898bddab4a72e6cb26eb054467b2f0ff93f5308793bbfda016d1a813df73e4abe8d06b"

RPROVIDES:${PN} += "openconnect-devel \
pkgconfig-openconnect"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenconnect5 \
pkgconfig-gnutls \
pkgconfig-liblz4 \
pkgconfig-libpcsclite \
pkgconfig-libproxy-1.0 \
pkgconfig-libpskc \
pkgconfig-libxml-2.0 \
pkgconfig-p11-kit-1 \
pkgconfig-stoken \
pkgconfig-zlib"

inherit rpm
