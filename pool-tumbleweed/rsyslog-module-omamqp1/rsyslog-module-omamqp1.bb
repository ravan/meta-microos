SUMMARY = "AMQP support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for AMQP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-omamqp1-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "4b8fe4a15d33c51b3abf440b58772eb294a6c1e548f1d0487eba608b988ab757a7969705aafead3ee80bf1f3d5fc8535d1931af44a730c10729fefb903cfac6f"

RPROVIDES:${PN} += "rsyslog-module-omamqp1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
