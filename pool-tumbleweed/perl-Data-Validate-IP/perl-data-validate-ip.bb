SUMMARY = "IPv4 and IPv6 validation methods"
DESCRIPTION = "This module provides a number IP address validation subs that both validate \
and untaint their input. This includes both basic validation ('is_ipv4()' \
and 'is_ipv6()') and special cases like checking whether an address belongs \
to a specific network or whether an address is public or private \
(reserved)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.310.0"

RPM_NAME = "perl-Data-Validate-IP-0.310.0-1.3.noarch.rpm"
RPM_HASH = "f6325600c0cdcc547dcec88cf1e3bb6af68ed3a897c3c98a9745da5e6f810732dc7aa647c0037898500cfea596cdf2fd010cab7cb56ba194b0a6c791adea13f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--IP \
perl-Data-Validate-IP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-NetAddr--IP"

inherit rpm
