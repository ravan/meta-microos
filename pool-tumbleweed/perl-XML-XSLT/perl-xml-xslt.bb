SUMMARY = "Perl module for processing XSLT"
DESCRIPTION = "This module implements the W3C's XSLT specification. The goal is full \
implementation of this spec, but we have not yet achieved that. However, it \
already works well. See XML::XSLT Commands for the current status of each \
command. \
 \
XML::XSLT makes use of XML::DOM and LWP::Simple, while XML::DOM uses \
XML::Parser. Therefore XML::Parser, XML::DOM and LWP::Simple have to be \
installed properly for XML::XSLT to run."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.48"

RPM_NAME = "perl-XML-XSLT-0.48-198.29.noarch.rpm"
RPM_HASH = "c6e9aa19f83e1f7e3123d5cb040888ebcc34c772390803967caca78daf48ddf98383306b319863121b1f1f47f0e861e601a0cc7c2efed2e30f5c08f2a66cf6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XSLT \
perl-XML--XSLT--DOM--TextDOE \
perl-XML-XSLT"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-XML--DOM \
perl-XML--Parser"

inherit rpm
