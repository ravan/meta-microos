SUMMARY = "TLS module for lighttpd that uses GnuTLS"
DESCRIPTION = "TLS module for lighttpd that uses GnuTLS."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_gnutls-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "cf4b9c5ea2ac9b58a086fd4506ea087e3d80b857577d6c8e352c4198cad945ebb1109c9c1fc7568766f6ee36d776fb4a377af38f1539b781e39edc2d04799ac4"

RPROVIDES:${PN} += "config-lighttpd-mod-gnutls \
lighttpd-mod-gnutls"

RDEPENDS:${PN} += "libc.so.6 \
libgnutls.so.30 \
lighttpd"

inherit rpm
