SUMMARY = "Rpm plugin for syslog functionality"
DESCRIPTION = "Rpm plugin for syslog functionality."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-syslog-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "2d4f4d21df1480512ad4928ab6526e94708bde85fcec82c053766466cb592c7ebe098ed48747839ebba9ce516d40b5a31b97529ee6b16c1fcf70f1b1cebd90ac"

RPROVIDES:${PN} += "rpm-/usr/lib64/rpm-plugins/syslog.so \
rpm-plugin-syslog"

RDEPENDS:${PN} += "rpm"

inherit rpm
