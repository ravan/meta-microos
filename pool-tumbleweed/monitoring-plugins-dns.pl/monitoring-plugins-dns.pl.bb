SUMMARY = "Monitor a DNS server"
DESCRIPTION = "A Perl based monitoring plugin which can be used to monitor a DNS server. It \
forms DNS queries of specific QTYPE and QNAME and sends them directly to the \
DNS server."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "monitoring-plugins-dns.pl-1.0.0-3.7.noarch.rpm"
RPM_HASH = "78ed41a068352f9b9d3282d28ca09957a5b78ebd0263754a05fa151e6f99936b8b68b5edbc43e84884821fcbe8658d2d2890e8e67dbdae01c78514891b0ec7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-dns.pl \
nagios-plugins-dns.pl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Long \
perl-IO--Select \
perl-IO--Socket \
perl-Socket"

inherit rpm
