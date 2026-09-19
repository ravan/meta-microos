SUMMARY = "Manipulate sets of IP addresses"
DESCRIPTION = "'Net::CIDR::Set' represents sets of IP addresses and allows standard set \
operations (union, intersection, membership test etc) to be performed on \
them. \
 \
In spite of the name it can work with sets consisting of arbitrary ranges \
of IP addresses - not just CIDR blocks. \
 \
Both IPv4 and IPv6 addresses are handled - but they may not be mixed in the \
same set. You may explicitly set the personality of a set: \
 \
  my $ip4set = Net::CIDR::Set->new({ type => 'ipv4 }, '10.0.0.0/8'); \
 \
Normally this isn't necessary - the set will guess its personality from the \
first data that is added to it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.230.0"

RPM_NAME = "perl-Net-CIDR-Set-0.230.0-1.1.noarch.rpm"
RPM_HASH = "e89ce362acd9dbdd2bbbf649996840203cd50438268d4b664128c6ae4cb69dea0f47d249371a72ee967dbf7866547f733f90cf18947e89c8cacd74fc8aee456a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Set \
perl-Net--CIDR--Set--IPv4 \
perl-Net--CIDR--Set--IPv6 \
perl-Net-CIDR-Set"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-namespace--autoclean"

inherit rpm
