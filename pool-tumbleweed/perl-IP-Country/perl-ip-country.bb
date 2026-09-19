SUMMARY = "Fast Lookup of Country Codes From Ip Addresses"
DESCRIPTION = "Finding the home country of a client using only the IP address can be \
difficult. Looking up the domain name associated with that address can \
provide some help, but many IP address are not reverse mapped to any useful \
domain, and the most common domain (.com) offers no help when looking for \
country. \
 \
This module comes bundled with a database of countries where various IP \
addresses have been assigned. Although the country of assignment will \
probably be the country associated with a large ISP rather than the client \
herself, this is probably good enough for most log analysis applications, \
and under test has proved to be as accurate as reverse-DNS and WHOIS \
lookup."
LICENSE = "(GPL-1.0+ | Artistic-1.0) & SUSE-Redistributable-Content"

PV = "2.28"

RPM_NAME = "perl-IP-Country-2.28-1.42.noarch.rpm"
RPM_HASH = "0acf60a46f34e8c6f12c14581588098ea79d8943d4e072972907b5ea96bc6f66209525a0a4ccb1e61d919406d7accea29961749c665b459aeb5f80a09ba09322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IP--Authority \
perl-IP--Country \
perl-IP--Country--Fast \
perl-IP--Country--MaxMind \
perl-IP--Country--Medium \
perl-IP--Country--Slow \
perl-IP-Country"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Geography--Countries"

inherit rpm
