SUMMARY = "Development files for the curl library"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, GOPHER, \
DICT, TELNET, LDAP, or FILE). The command is designed to work without \
user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "libcurl-devel-8.22.0-1.1.aarch64.rpm"
RPM_HASH = "929c957489bd69cc5a8ccc38798b04f2b806a1ccec154d3c0e2715f5378abc58b10a4e4c3412a36b19f86391c2cf26f732b44b2572c5795896c815fe1ef34d72"

RPROVIDES:${PN} += "curl-devel \
libcurl-devel \
pkgconfig-libcurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcurl4 \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libidn2 \
pkgconfig-libnghttp2 \
pkgconfig-libnghttp3 \
pkgconfig-libngtcp2 \
pkgconfig-libngtcp2-crypto-ossl \
pkgconfig-libpsl \
pkgconfig-libssh \
pkgconfig-libzstd \
pkgconfig-mit-krb5-gssapi \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
