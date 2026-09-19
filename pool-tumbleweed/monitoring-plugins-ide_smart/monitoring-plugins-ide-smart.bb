SUMMARY = "Check local hard drive"
DESCRIPTION = "This plugin checks a local hard drive with the (Linux specific) SMART \
interface. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-ide_smart/README.SUSE-check_ide_smart \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ide_smart-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "829ccc7fb52eaa3cc2c799843af90301cd373ce3b46898b7c2643a54c63b18b1622d76377fd023056173f911ac68ba33f147635b43c554523005dda4ea3c0fe2"

RPROVIDES:${PN} += "config-monitoring-plugins-ide-smart \
monitoring-plugins-ide-smart \
nagios-plugins-ide-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
