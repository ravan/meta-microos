SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.67"

RPM_NAME = "apache2-utils-2.4.67-1.3.aarch64.rpm"
RPM_HASH = "2878be3a6a6fa95decb49511d4a61f7221169e84255f2af11e1da1d1ab1a1be08b44a122f856be96c035144368de8f4dac881024d2b0c228470c46db46b3911e"

RPROVIDES:${PN} += "apache2-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/which \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3"

inherit rpm
