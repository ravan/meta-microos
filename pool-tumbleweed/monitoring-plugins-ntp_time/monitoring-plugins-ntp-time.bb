SUMMARY = "Check clock offset with the ntp server"
DESCRIPTION = "This plugin checks the clock offset between the local host and a remote NTP \
server. It is independent of any commandline programs or external libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ntp_time-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "58b05e7dce190f198c18239a12d967a0530a017fd39a8e8e4cd31548e774b16628f66d070bb39293d946f8e908b57ce02cd6f013b6385b77cdf26c3c1529ff2c"

RPROVIDES:${PN} += "config-monitoring-plugins-ntp-time \
monitoring-plugins-ntp \
monitoring-plugins-ntp-time \
nagios-plugins-ntp-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
