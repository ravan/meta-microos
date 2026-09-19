SUMMARY = "GSS-API support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support to receive syslog messages from the \
network protected via Kerberos 5 encryption and authentication."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-gssapi-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "ac6eebbb972c8ae4463c6d62140c0359d101bf131ea596815d285902df636169c456f67658577eeee0958bc2343fca5b2f455aaefa2747d6f157d73fcc64e1f8"

RPROVIDES:${PN} += "rsyslog-module-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
rsyslog"

inherit rpm
