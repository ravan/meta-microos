SUMMARY = "Manipulate IPv4/IPv6 netblocks in CIDR notation"
DESCRIPTION = "The Net::CIDR package contains functions that manipulate lists of IP \
netblocks expressed in CIDR notation. The Net::CIDR functions handle both \
IPv4 and IPv6 addresses. \
 \
The cidrvalidate() function, described below, checks that its argument is a \
single, valid IP address or a CIDR. The remaining functions expect that \
their parameters consist of validated IPs or CIDRs. See cidrvalidate() and \
BUGS, below, for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-Net-CIDR-0.270.0-2.3.noarch.rpm"
RPM_HASH = "a639e01637ebcdfaa31a3270c7852c51861530bfdf7b90f768e49fe6eeb40112521ea45a625be17eeec5ffb8ab1db70f0ece4cde670f37b25ba0a01ca176730b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR \
perl-Net-CIDR"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
