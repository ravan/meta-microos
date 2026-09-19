SUMMARY = "Perl extension for comparing XML documents"
DESCRIPTION = "XML::SematicDiff provides a way to compare the contents and structure of \
two XML documents. By default, it returns a list of hashrefs where each \
hashref describes a single difference between the two docs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0007"

RPM_NAME = "perl-XML-SemanticDiff-1.0007-1.32.noarch.rpm"
RPM_HASH = "b1b99469a3a8636a65ce9f703e988902abed2111a8d947eb3b5e7db2cc02c812ff1b39b71e5a35603a5e07f8c8bb94377573e6e0239dd7c4c7f1b329fab5d97d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SemanticDiff \
perl-XML--SemanticDiff--BasicHandler \
perl-XML--SemanticDiff--PathFinder \
perl-XML--SemanticDiff--PathFinder--Obj \
perl-XML-SemanticDiff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--Parser"

inherit rpm
