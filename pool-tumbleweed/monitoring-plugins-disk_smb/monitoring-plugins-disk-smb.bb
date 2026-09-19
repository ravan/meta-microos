SUMMARY = "Check SMB Disk"
DESCRIPTION = "Check the amount of used disk space on a remote Samba or Windows share and \
generate an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-disk_smb-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "bb8ca87b7e1771e35ac890d14ecf30049728120eb999781cc1466ff918be3540822be95e8ba0c029a697bf5390342ef4c7742c9f8c9f6371be4069cfa8467e47"

RPROVIDES:${PN} += "monitoring-plugins-disk-smb \
nagios-plugins-disk-smb"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm
