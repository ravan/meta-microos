SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the OpenSSL library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-ossl-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "42d184b3cac4e12041037920e32766402126779ec5a448e06766327943701d8b6833ab219410e319aa850ec630347d85d1c0986f0e1e9b469f24dc534f8f1374"

RPROVIDES:${PN} += "rsyslog-module-ossl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
rsyslog"

inherit rpm
