SUMMARY = "A C++11 HTTP/HTTPS library"
DESCRIPTION = "This is a multi-threaded HTTP library with blocking I/O. There is no \
support for non-blocking mode."
LICENSE = "MIT"

PV = "0.49.0"

RPM_NAME = "libcpp-httplib0_49-0.49.0-1.2.aarch64.rpm"
RPM_HASH = "5f65bf0211a1feb9aa5cc45a6f599c24da8a81aaf33a5f61b76ba8828b60cb9238e75fc6a4fdcfb18d210c3d28f94ebe73de39de5c4c85c7edcec04fac507e2f"

RPROVIDES:${PN} += "libcpp-httplib.so.0.49 \
libcpp-httplib0-49"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
