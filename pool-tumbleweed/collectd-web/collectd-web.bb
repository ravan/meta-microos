SUMMARY = "Web Frontend for watching the collectd Statistics"
DESCRIPTION = "Web frontend CGI for watching collectd statistics from a browser. \
 \
Please look at /etc/apache2/conf.d/collectd.conf on how to enable."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-web-5.12.0.382.g2cd055fe-3.1.noarch.rpm"
RPM_HASH = "32856164a13ff654376d724affc4226d92b7153d5733696c9e44f834397fb59b7e1a7d617ba9a762acce0f9c5684118260f865298c4716316dbe173a723d975a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-web \
config-collectd-web"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
perl \
perl-CGI \
perl-Data--Dumper \
perl-HTML--Entities \
perl-RRDs \
perl-URI--Escape \
rrdtool"

inherit rpm
