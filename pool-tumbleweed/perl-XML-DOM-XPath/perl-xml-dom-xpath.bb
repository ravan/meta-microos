SUMMARY = "Perl extension to add XPath support to XML::DOM, using XML::XPath engine"
DESCRIPTION = "XML::DOM::XPath allows you to use XML::XPath methods to query a DOM. This \
is often much easier than relying only on getElementsByTagName."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-XML-DOM-XPath-0.14-8.9.noarch.rpm"
RPM_HASH = "640f4a3875d258a97e3d2066be21475a5b1e9ea9a2fe500c3794ddf2278759934d5eb2226c6ab141958fca27dd6c1c17ffea11d7d8718becec0551fac6f99601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--DOM--Attr \
perl-XML--DOM--Comment \
perl-XML--DOM--Document \
perl-XML--DOM--Element \
perl-XML--DOM--Namespace \
perl-XML--DOM--Node \
perl-XML--DOM--ProcessingInstruction \
perl-XML--DOM--Text \
perl-XML--DOM--XPath \
perl-XML-DOM-XPath"

RDEPENDS:${PN} += "perl \
perl-XML--DOM \
perl-XML--XPathEngine"

inherit rpm
