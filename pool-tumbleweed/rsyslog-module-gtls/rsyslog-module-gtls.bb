SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the GnuTLS library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-gtls-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "eddc1a9ddc9b033f9fd379679721e7b8ddfc888b96b9127d856c254bd51cd495689f9bd259153e65076e11ef9a4a037491950f8ba5631e770cf92eb9d3a5c5b5"

RPROVIDES:${PN} += "rsyslog-module-gtls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
rsyslog"

inherit rpm
