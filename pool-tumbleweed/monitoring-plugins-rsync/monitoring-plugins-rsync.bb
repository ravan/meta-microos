SUMMARY = "Check rsync servers availability"
DESCRIPTION = "Checks rsync servers availability, as well as (optionally) individual \
modules availability. It also supports authentication on modules. \
 \
Usage: check_rsync -H  [-p ] [-m [,,] [-m [,,]...]] \
 \
The only required argument is -H, in which case it will only try to \
list modules on the Rsync server."
LICENSE = "GPL-2.0-or-later"

PV = "1.02"

RPM_NAME = "monitoring-plugins-rsync-1.02-5.7.noarch.rpm"
RPM_HASH = "8a6a5b76e0f36581a5724e3b8356c20c98338a9f7a3b86026320c2466057edb937341c6696fed4e33d61c59267c16a38a5027f214ad15978cc84dbca650d5dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-rsync \
nagios-plugins-rsync"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Long \
rsync"

inherit rpm
