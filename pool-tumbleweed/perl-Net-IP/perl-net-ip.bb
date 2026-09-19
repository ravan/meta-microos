SUMMARY = "Perl extension for manipulating IPv4/IPv6 addresses"
DESCRIPTION = "This module provides functions to deal with *IPv4/IPv6* addresses. The \
module can be used as a class, allowing the user to instantiate IP objects, \
which can be single IP addresses, prefixes, or ranges of addresses. There \
is also a procedural way of accessing most of the functions. Most \
subroutines can take either *IPv4* or *IPv6* addresses transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Net-IP-1.26-9.12.noarch.rpm"
RPM_HASH = "2b73df47de734bbe0e2cfde6b7660274c8a51fed182c5b4b2302fca7b0c4d11c78739aed22e3769e35f8d6eb1aed62505086a310de1566c1f880f6eb6174fd90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IP \
perl-Net-IP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
