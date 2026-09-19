SUMMARY = "TCL output module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides an output module for TCL."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-omtcl-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "49c1e1159512d62cf61ed6d2b98d674c26a1735890cab93f1b93298754a14431c3e20dcfeadf54b95124a8029b6bd87c5e8635c546a7d0f07140738ac20571e0"

RPROVIDES:${PN} += "rsyslog-module-omtcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
rsyslog"

inherit rpm
