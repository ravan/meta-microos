SUMMARY = "Core libraries for Shorewall"
DESCRIPTION = "This package contains the core libraries for Shorewall."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-core-5.2.8-6.13.noarch.rpm"
RPM_HASH = "b2089dada46f745ca5275b35c2e91e6aaee0b126ee468da06d124e17c6d083239f7ab618d06aaf58875f27879896fcbe07159d0bed9be648f04dcd15b859cddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-core"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
perl-base"

inherit rpm
