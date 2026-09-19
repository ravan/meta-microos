SUMMARY = "DTLS support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for securely transporting syslog messages over \
the network using the Datagram Transport Layer Security (DTLS) protocol."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-dtls-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "f6736c4cb0eb05baa70fcbbde90406df5d267e1aaffd7d89227db11ee50f9ad8bd094ffc05f59b5c2da7f018225357e31785d880a60639ac8e3475c7970fc825"

RPROVIDES:${PN} += "rsyslog-module-dtls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
rsyslog \
rsyslog-module-ossl"

inherit rpm
