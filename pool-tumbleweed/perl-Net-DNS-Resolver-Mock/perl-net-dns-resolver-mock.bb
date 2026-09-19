SUMMARY = "Mock a DNS Resolver object for testing"
DESCRIPTION = "A subclass of Net::DNS::Resolver which parses a zonefile for it's data \
source. Primarily for use in testing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230216"

RPM_NAME = "perl-Net-DNS-Resolver-Mock-1.20230216-1.17.noarch.rpm"
RPM_HASH = "d2ea7bd06ab3ca8924f957d431a3577c8a065119f7fcb37443b6e38d188dc1253210f395cf5afee9c1985c07d8495692ee59d61d5cfbf8b6f5bd623780cbda5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Mock \
perl-Net-DNS-Resolver-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Net--DNS--Packet \
perl-Net--DNS--Question \
perl-Net--DNS--Resolver \
perl-Net--DNS--ZoneFile"

inherit rpm
