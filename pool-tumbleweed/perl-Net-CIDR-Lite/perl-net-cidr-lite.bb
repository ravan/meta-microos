SUMMARY = "Perl extension for merging IPv4 or IPv6 CIDR addresses"
DESCRIPTION = "Faster alternative to Net::CIDR when merging a large number of CIDR address \
ranges. Works for IPv4 and IPv6 addresses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.240.0"

RPM_NAME = "perl-Net-CIDR-Lite-0.240.0-1.3.noarch.rpm"
RPM_HASH = "a568760a457b966bf1e94af16f2cc923aeeb9b6672fe10025047027885ef51744c640d76cac2df37f750a3056220774e985dd3c08547f21a3ac50d8d3d12e1c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Lite \
perl-Net--CIDR--Lite--Span \
perl-Net-CIDR-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
