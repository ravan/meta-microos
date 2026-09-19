SUMMARY = "BIND9 Monitoring Plugin"
DESCRIPTION = "Plugins for BIND9 and DNS resolver monitoring. The check_bind9.pl plugin \
expects to run on the host running BIND. \
 \
Please run it with --help to see where it expects to find a variety of files \
and commands, and the options you are likely to require to provide."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "monitoring-plugins-bind9-1.0.0-3.7.noarch.rpm"
RPM_HASH = "02dd712718604d7ec0eecf15f4974c9dc0645c8cce1d6a41bf00859a67459512ed5e1b6ce00e19d6e42c63e4520275e2d8c39ee669d22c108218f6ad7b217674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-bind9 \
monitoring-plugins-bind9 \
nagios-plugins-bind9"

RDEPENDS:${PN} += "/usr/bin/perl \
bind-utils \
perl-Getopt--Long \
perl-IO--File \
perl-IO--Handle \
sudo"

inherit rpm
