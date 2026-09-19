SUMMARY = "Perl bindings for ldns"
DESCRIPTION = "Perl bindings for the ldns library."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "perl-DNS-LDNS-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "f55ff994d6b506723d6fd5ac3789e2fd9b2429ff3646055bb15e76be22279937e0b3fd342d815d4b4fc24909f19bc9630633e37234cfe63cd583ab73e6bb8d04"

RPROVIDES:${PN} += "perl-DNS--LDNS \
perl-DNS--LDNS--DNSSecDataChain \
perl-DNS--LDNS--DNSSecName \
perl-DNS--LDNS--DNSSecRRSets \
perl-DNS--LDNS--DNSSecRRs \
perl-DNS--LDNS--DNSSecTrustTree \
perl-DNS--LDNS--DNSSecZone \
perl-DNS--LDNS--GC \
perl-DNS--LDNS--Key \
perl-DNS--LDNS--KeyList \
perl-DNS--LDNS--Packet \
perl-DNS--LDNS--RBNode \
perl-DNS--LDNS--RBTree \
perl-DNS--LDNS--RData \
perl-DNS--LDNS--RR \
perl-DNS--LDNS--RRList \
perl-DNS--LDNS--Resolver \
perl-DNS--LDNS--Zone \
perl-DNS-LDNS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldns3 \
perl"

inherit rpm
