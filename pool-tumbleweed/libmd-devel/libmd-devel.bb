SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.2.0"

RPM_NAME = "libmd-devel-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "407bbb2b7330d2b35053813e8b08cd6765a3048d42569c1319d5d6e5508af5c853f8965cd1fd7334ec93a5007879093ef9a72b795f3885cf7e5d2bcd35bd2651"

RPROVIDES:${PN} += "libmd-devel \
pkgconfig-libmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmd0"

inherit rpm
