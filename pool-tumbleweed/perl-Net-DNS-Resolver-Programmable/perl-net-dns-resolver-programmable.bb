SUMMARY = "Programmable Dns Resolver Class for Offline"
DESCRIPTION = "*Net::DNS::Resolver::Programmable* is a *Net::DNS::Resolver* descendant \
class that allows a virtual DNS to be emulated instead of querying the real \
DNS. A set of static DNS records may be supplied, or arbitrary code may be \
specified as a means for retrieving DNS records, or even generating them on \
the fly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Net-DNS-Resolver-Programmable-0.009-1.37.noarch.rpm"
RPM_HASH = "5143b08fdbf2d4ca5147f5e601fadbf8aa55d80b34e990a9f136f1808cf8bcbfb327ecfcd078067c3b09b54b0fda2f9b84d6975a6109e42c4728b08e350f5a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Programmable \
perl-Net-DNS-Resolver-Programmable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Net--DNS"

inherit rpm
