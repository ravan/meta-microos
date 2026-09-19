SUMMARY = "Monitor network interfaces"
DESCRIPTION = "This plugin monitors operational status of a particular network interface on \
the target host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ifoperstatus-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "67e6f78dbf72e7fa6e3fc105ec56d564c4ef0275fd32cad5dd3342cdd0ee0eb0c54e15ca1bf84164d935ea66d0d37e9614157d1dee34812066322042018d5d9b"

RPROVIDES:${PN} += "monitoring-plugins-ifoperstatus \
nagios-plugins-ifoperstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net--SNMP"

inherit rpm
