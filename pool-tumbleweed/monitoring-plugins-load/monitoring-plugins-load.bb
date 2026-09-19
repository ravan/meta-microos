SUMMARY = "Test the current system load average"
DESCRIPTION = "This plugin tests the current system load average."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-load-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "cdd9572a977fac83df2a3c702f113cc9fc93aaff617c8fc0a39d4499d9f608841f6456ffc668b51b67231e3b74a0b0d81d78789814cc27fd407fd448227c624f"

RPROVIDES:${PN} += "config-monitoring-plugins-load \
monitoring-plugins-load \
nagios-plugins-load"

RDEPENDS:${PN} += "coreutils-systemd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
