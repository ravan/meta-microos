SUMMARY = "Check SMART status of a given disk"
DESCRIPTION = "This plugin does SMART monitoring both ATA and SCSI disks, has an easy usage \
syntax, and automatically produces perfdata for all applicable metrics. \
 \
Note: \
On older distributions you need a line like \
 nagios        ALL=(root) NOPASSWD: /usr/lib/nagios/plugins/check_smart \
in /etc/sudoers to run this script as non privileged user. \
 \
Since SLES 12/openSUSE 12.1, there is a file \
  /etc/sysconfig/sudoers.d/monitoring-plugins-smart \
which holds the same content and should be used automatically."
LICENSE = "GPL-3.0-or-later"

PV = "6.18.3"

RPM_NAME = "monitoring-plugins-smart-6.18.3-1.1.noarch.rpm"
RPM_HASH = "7db1f09d0ac2328f9459f22756c4c3c48249da5445c3d5f6cb1d49ccc76dbccbc5459329998fa66c77454a28357dafaa92a66be3de8dde837c654924c1ca04c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-smart \
monitoring-plugins-smart \
nagios-plugins-smart"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-File--Basename \
perl-FindBin \
perl-Getopt--Long \
smartmontools \
sudo"

inherit rpm
