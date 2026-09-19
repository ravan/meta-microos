SUMMARY = "UDP spoof support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides a UDP forwarder that allows changing the sender address."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-udpspoof-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "ca76ca1dc30a8cecb38e9ab65e4e2515dd3223775ad445759449c9ba278c460fdda7ac8aefc917c83794102c009fa9a7bae5856af26b4a216e57d97a0e4f77b6"

RPROVIDES:${PN} += "config-rsyslog-module-udpspoof \
rsyslog-module-udpspoof"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnet.so.9 \
rsyslog"

inherit rpm
