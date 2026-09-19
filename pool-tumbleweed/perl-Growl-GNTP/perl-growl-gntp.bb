SUMMARY = "Perl implementation of GNTP Protocol (Client Part)"
DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Growl-GNTP-0.21-1.38.noarch.rpm"
RPM_HASH = "e6a49b8f537e7df8956364fb93b01ee9f863519dca766debe9a2e8ae789bc1638daae4b5fc4a9d5adfe6e85c17a4e0aeb90c0104af5ca9bec372ab4f3942ec60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Growl--GNTP \
perl-Growl-GNTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--CBC \
perl-Data--UUID \
perl-Digest--SHA"

inherit rpm
