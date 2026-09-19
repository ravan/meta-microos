SUMMARY = "Contains the mmnormalize support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log normalizing support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-mmnormalize-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "9b4c7535a65790cf71029530c15961d4497c0ba3220b94f28e322cf12a5a07fd604728c414264e1bae3cef6009ffd8096f87773952712c73949aa3d852757754"

RPROVIDES:${PN} += "rsyslog-module-mmnormalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjson.so.4 \
liblognorm.so.5 \
rsyslog"

inherit rpm
