SUMMARY = "Checks the traffic on any interface"
DESCRIPTION = "check_traffic_limit is a Nagios plugin based on vnstat. It checks the traffic \
on any interface and sends a warning when defined daily or monthly limits are \
reached. The plugin comes with Nagios grapher templates. \
 \
Example: \
./check_traffic_limit -i eth0 -w 10000 -c 12000 -p d"
LICENSE = "BSD-4-Clause"

PV = "0.5"

RPM_NAME = "monitoring-plugins-traffic_limit-0.5-2.7.noarch.rpm"
RPM_HASH = "77e25fc7a11bfaeaf6c0cd7e500b2977773eb8043de29ff8c7819ebc70e62db128da9ad4b67d1d89bd78e2dbfa1a97c03ce051e93ccfc6161798778063054abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-traffic-limit \
nagios-plugins-traffic-limit"

RDEPENDS:${PN} += "/usr/bin/perl \
gawk \
grep \
perl-Monitoring--Plugin \
vnstat"

inherit rpm
