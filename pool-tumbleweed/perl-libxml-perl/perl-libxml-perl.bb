SUMMARY = "Collection of Perl modules for working with XML"
DESCRIPTION = "perl-libxml-perl is a collection of Perl modules for working with XML. \
 \
 \
 \
Authors: \
-------- \
    Ken MacLeod <ken@bitsko.slc.ut.us>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.08"

RPM_NAME = "perl-libxml-perl-0.08-161.12.aarch64.rpm"
RPM_HASH = "7ff15d43f44458cd8df8b6d0d691c338f9b7d77a6985a7be04c6348cad1eab1d740357880f42c156ca7a579a266112b93739b4fd3fa92ee2b7ea9060fc0e282b"

RPROVIDES:${PN} += "perl-Data--Grove \
perl-Data--Grove--Characters \
perl-Data--Grove--Parent \
perl-Data--Grove--ParentList \
perl-Data--Grove--Visitor \
perl-XML--ESISParser \
perl-XML--Handler--CanonXMLWriter \
perl-XML--Handler--Sample \
perl-XML--Handler--Subs \
perl-XML--Handler--XMLWriter \
perl-XML--Parser--PerlSAX \
perl-XML--PatAct--ACTION \
perl-XML--PatAct--Amsterdam \
perl-XML--PatAct--MatchName \
perl-XML--PatAct--PATTERN \
perl-XML--PatAct--ToObjects \
perl-XML--Perl2SAX \
perl-XML--SAX2Perl \
perl-libxml-perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML-Parser"

inherit rpm
