SUMMARY = "Perl module Pod::HtmlPsPdf"
DESCRIPTION = "Documentation projects builder in HTML, PS and PDF formats. \
 \
 \
 \
Authors: \
-------- \
    Stas Bekman <stas@stason.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Pod-HtmlPsPdf-0.04-510.47.aarch64.rpm"
RPM_HASH = "8bdb332c3c2fd5777f749acd6f4883beaadbe2bb271fc8cd964183492552a3d1245813b6f39da59b6dc21dea5a1b9eb02fe90a634928d1aa26c4d861ad6e0084"

RPROVIDES:${PN} += "perl-Pod--HtmlPsPdf \
perl-Pod--HtmlPsPdf--Book \
perl-Pod--HtmlPsPdf--Chapter \
perl-Pod--HtmlPsPdf--Common \
perl-Pod--HtmlPsPdf--Config \
perl-Pod--HtmlPsPdf--Html \
perl-Pod--HtmlPsPdf--RunTime \
perl-Pod-HtmlPsPdf"

RDEPENDS:${PN} += "/usr/bin/perl \
html2ps \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
