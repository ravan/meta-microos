SUMMARY = "Check health of an NTP server"
DESCRIPTION = "Use this plugin to check the health of an NTP server. It supports \
checking the offset with the sync peer, the jitter and stratum. \
 \
This plugin will not check the clock offset between the local host and NTP \
server; please use check_ntp_time for that purpose."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ntp_peer-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "a548710179196187b172dc346fbfc208f37dae6829d8686136b8a71f2f6762d28b3cc47d447bf031fde16a9b29f2c76a7a80b2c6ad9a7509e189dd434697a66f"

RPROVIDES:${PN} += "monitoring-plugins-ntp-peer \
nagios-plugins-ntp-peer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
