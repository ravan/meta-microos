SUMMARY = "Parse and evaluate XPath statements"
DESCRIPTION = "This module aims to comply exactly to the XPath specification at \
http://www.w3.org/TR/xpath and yet allow extensions to be added in the form \
of functions.Modules such as XSLT and XPointer may need to do this as they \
support functionality beyond XPath."
LICENSE = "Artistic-2.0"

PV = "1.490.0"

RPM_NAME = "perl-XML-XPath-1.490.0-1.4.noarch.rpm"
RPM_HASH = "105ead85ec3dabb6850307c31e9d7dcf8acc1fee77712c02383240f9f8e2ec5080ba4941bd88da84eadbf6c6a58739c4073eaffdd54a51a7dfbde8563f2f526d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XPath \
perl-XML--XPath--Boolean \
perl-XML--XPath--Builder \
perl-XML--XPath--Expr \
perl-XML--XPath--Function \
perl-XML--XPath--Literal \
perl-XML--XPath--LocationPath \
perl-XML--XPath--Node \
perl-XML--XPath--Node--Attribute \
perl-XML--XPath--Node--AttributeImpl \
perl-XML--XPath--Node--Comment \
perl-XML--XPath--Node--Element \
perl-XML--XPath--Node--Namespace \
perl-XML--XPath--Node--PI \
perl-XML--XPath--Node--Text \
perl-XML--XPath--NodeSet \
perl-XML--XPath--Number \
perl-XML--XPath--Parser \
perl-XML--XPath--PerlSAX \
perl-XML--XPath--Root \
perl-XML--XPath--Step \
perl-XML--XPath--Variable \
perl-XML--XPath--XMLParser \
perl-XML-XPath"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-Scalar--Util \
perl-XML--Parser"

inherit rpm
