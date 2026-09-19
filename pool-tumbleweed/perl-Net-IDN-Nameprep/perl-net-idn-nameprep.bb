SUMMARY = "Stringprep Profile for Internationalized Domain Names (RFC 3491)"
DESCRIPTION = "This module implements the _nameprep_ specification, which describes how to \
prepare internationalized domain name (IDN) labels in order to increase the \
likelihood that name input and name comparison work in ways that make sense \
for typical users throughout the world. Nameprep is a profile of the \
stringprep protocol and is used as part of a suite of on-the-wire protocols \
for internationalizing the Domain Name System (DNS)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.102"

RPM_NAME = "perl-Net-IDN-Nameprep-1.102-2.30.noarch.rpm"
RPM_HASH = "4ed0ea15005d27ea80e45541cdfb760beab886fb1ec80ee393de8ed6cb384615ad1f09bbe3d8d2397d0092a07304f00459d9c3b2972d33c336002cb13c0abd46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IDN--Nameprep \
perl-Net-IDN-Nameprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Unicode--Stringprep"

inherit rpm
