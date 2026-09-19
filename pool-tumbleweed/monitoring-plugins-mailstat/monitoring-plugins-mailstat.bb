SUMMARY = "Monitoring mail server statistics"
DESCRIPTION = "This plugin includes a patch for mailgraph so that it will also output its \
statistics counter to an external file(plus the rra file),and a \
check_mailstat.pl which check the stat counter to see if it’s ok, emit \
WARN/CRITICAl result if not.It can run on nagios server, or on remote server \
via NRPE."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "monitoring-plugins-mailstat-0.9.1-103.7.noarch.rpm"
RPM_HASH = "42cb8c82cf7b426eb5cb122be7400cfbec920b6829921eac529bf6048faf5ee8c760270502dbfd85fcaa7f078591eb13186001d09a5bcdb63b6462ae69c1225f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-mailstat \
monitoring-plugins-mailstat \
nagios-plugins-mailstat"

RDEPENDS:${PN} += "/usr/bin/perl \
mailgraph \
monitoring-plugins-common \
perl-RRDs"

inherit rpm
