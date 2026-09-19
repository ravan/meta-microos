SUMMARY = "RELP protocol support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides Reliable Event Logging Protocol support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-relp-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "c901e0492c4e284bd669eda8eb1cb76830286ad490a9ccfac7462a50501665f4589348524107564e21ba182e161f9af669b67d30872bc8a3798fe6cb983fdf2e"

RPROVIDES:${PN} += "rsyslog-module-relp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librelp.so.0 \
librelp0 \
rsyslog"

inherit rpm
