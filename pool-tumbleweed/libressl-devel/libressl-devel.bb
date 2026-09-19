SUMMARY = "Development files for LibreSSL, an SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols. It derives from OpenSSL, \
with refactorings. \
 \
LibreSSL provides much of the OpenSSL 1.1 API. The OpenSSL 3 API is not \
currently supported, but many programs only need v1.1. See \
/usr/share/doc/packages/libressl-devel-doc/unavailable-libcrypto-symbols.txt.zst for \
a list of symbols/functions that cannot be exercised when building \
with libressl. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libressl."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libressl-devel-4.3.2-1.3.aarch64.rpm"
RPM_HASH = "40e1e2b1592c0c98cedcc23d4e2c4cdfab7ff5dc6f47201c871fd1d1a98355b7b34a724ca7809bcd548971e1df9c9613243839041394ed55197c01f9bbcf7efc"

RPROVIDES:${PN} += "libressl-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-libtls \
pkgconfig-openssl \
ssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypto57 \
libssl60 \
libtls33 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
