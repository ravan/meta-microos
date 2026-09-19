SUMMARY = "Manages IPv4 and IPv6 addresses and subnets"
DESCRIPTION = "This module provides an object-oriented abstraction on top of IP addresses \
or IP subnets that allows for easy manipulations. Version 4.xx of \
NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt. \
 \
The internal representation of all IP objects is in 128 bit IPv6 notation. \
IPv4 and IPv6 objects may be freely mixed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.079"

RPM_NAME = "perl-NetAddr-IP-4.079-1.52.aarch64.rpm"
RPM_HASH = "abd3a9000259add4a5ef894561dd5fc977b2dd5417c2521a3bdc2ab411da535306797b1e8a189c78ab1381f52d789262c577ae1792469e1390c03b633c7f823d"

RPROVIDES:${PN} += "perl-NetAddr--IP \
perl-NetAddr--IP--InetBase \
perl-NetAddr--IP--Lite \
perl-NetAddr--IP--Util \
perl-NetAddr--IP--Util-IS \
perl-NetAddr--IP--UtilPP \
perl-NetAddr--IP--UtilPolluted \
perl-NetAddr-IP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
