SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.67"

RPM_NAME = "apache2-event-2.4.67-1.3.aarch64.rpm"
RPM_HASH = "e3eb34a647c8fbc59cba50d32abc05d28d43dc16d4edd1156a89694b8d60f5a6cada63acee4e636c05b80f65a7491f6e6d874f55d0aed6ec5f31e9f2f6427958"

RPROVIDES:${PN} += "apache2-MPM \
apache2-event"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
apache2 \
fillup \
grep \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libbrotlienc.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libjansson.so.4 \
liblber.so.2 \
libldap.so.2 \
liblua5.4.so.5 \
libnghttp2.so.14 \
libpcre2-8.so.0 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1 \
permissions"

inherit rpm
