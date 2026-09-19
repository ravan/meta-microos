SUMMARY = "A C++11 HTTP/HTTPS library"
DESCRIPTION = "This is a multi-threaded HTTP library with blocking I/O. There is no \
support for non-blocking mode. \
 \
It features built-in mappings, static file server, pre-routing and \
post-routing handlers, and support for binding sockets to multiple \
interfaces and any available port."
LICENSE = "MIT"

PV = "0.49.0"

RPM_NAME = "cpp-httplib-devel-0.49.0-1.2.aarch64.rpm"
RPM_HASH = "819b8dfb7cbebe5db2d8d0a207babf03d5a45db14120067a2ffc2609e0513ae33c5f3f227a5d93285d2b477be04d04816581f77632431d7559cd0d55931f92fe"

RPROVIDES:${PN} += "cmake-httplib \
cpp-httplib-devel \
pkgconfig-cpp-httplib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpp-httplib0-49 \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libzstd \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
