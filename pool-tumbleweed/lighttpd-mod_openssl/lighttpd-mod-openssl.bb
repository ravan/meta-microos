SUMMARY = "TLS module for lighttpd that uses OpenSSL"
DESCRIPTION = "TLS module for lighttpd that uses OpenSSL."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_openssl-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "73d1a0b18e209fd35eced0447b4ea3caa80e363537d3809a3c325c58ed33b5ffb99ec7c05658fd09c6f6006a40937b190be853adc161cc0a6aaffdbe35813646"

RPROVIDES:${PN} += "config-lighttpd-mod-openssl \
lighttpd-/usr/lib64/lighttpd/mod-openssl.so \
lighttpd-mod-openssl"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lighttpd"

inherit rpm
