SUMMARY = "Check incoming/outgoing transfer rates of a router"
DESCRIPTION = "This plugin will check the incoming/outgoing transfer rates of a router, \
switch, etc recorded in an MRTG log.  If the newest log entry is older \
than <expire_minutes>, a WARNING status is returned. If either the \
incoming or outgoing rates exceed the <icl> or <ocl> thresholds (in \
Bytes/sec), a CRITICAL status results.  If either of the rates exceed \
the <iwl> or <owl> thresholds (in Bytes/sec), a WARNING status results."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-mrtgtraf-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "f2543b758b4481168184a78a9775090e7d27d4120d90944358148ae4c4f06ab3ea50a24b08db6e43905dcfa6d63571f5a2612a2c5afc234abc21c4127ccfe6f6"

RPROVIDES:${PN} += "monitoring-plugins-mrtgtraf \
nagios-plugins-mrtgtraf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
