SUMMARY = "Send and receive multicast messages"
DESCRIPTION = "The IO::Socket::Multicast module subclasses IO::Socket::INET to enable \
you to manipulate multicast groups. With this module (and an operating \
system that supports multicasting), you will be able to receive \
incoming multicast transmissions and generate your own outgoing \
multicast packets. \
 \
 \
 \
Authors: \
-------- \
    Lincoln Stein <lstein@cshl.org>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.12"

RPM_NAME = "perl-IO-Socket-Multicast-1.12-19.56.aarch64.rpm"
RPM_HASH = "547af9c67b711c1972a12b1449ac0e90d44b65bc6e4ee5dd028761f3bf8e026e7b1727bafb18a506c00cdfb97861173c48558020fffa31aa0d2f8203b878bc75"

RPROVIDES:${PN} += "perl-IO--Socket--Multicast \
perl-IO-Socket-Multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-IO--Interface"

inherit rpm
