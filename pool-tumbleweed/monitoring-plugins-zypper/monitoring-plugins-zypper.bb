SUMMARY = "Check for software updates via zypper"
DESCRIPTION = "This plugin checks for software updates on systems that use package \
management systems based on the zypper command found in (open)SUSE. \
 \
It checks for security, recommended and optional patches and also for \
optional package updates. \
 \
You can define the status by patch category. Use a commata to list more \
than one category to a state. \
 \
If you like to know the names of available patches and packages, use \
the '-v' option."
LICENSE = "BSD-3-Clause"

PV = "1.98.12"

RPM_NAME = "monitoring-plugins-zypper-1.98.12-1.4.noarch.rpm"
RPM_HASH = "81134b9eb3b7d4c68162d81bbc451644f3d9ac52c3fbf60316b1393406e2d95cd33d9fe8ec3c95edfe67ec5dff1c4bd9711c3e83865ca94931a5de8779b416ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-zypper \
monitoring-plugins-zypper \
nagios-plugins-zypper"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apparmor-abstractions \
gawk \
grep \
perl-Getopt--Long \
perl-POSIX \
perl-Time--Local \
rpm \
sudo \
systemd \
zypper"

inherit rpm
