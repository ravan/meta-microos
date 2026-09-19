SUMMARY = "Manual for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains the manual for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-manual-2.7.3-4.6.noarch.rpm"
RPM_HASH = "d25496440808b0262169c8a81afcc2a3e24914fdc468b35afa19e3aa9db10b37f1619498aa0242fa71ac32d29d746a8507428dabf1a0a96a526acb58f3f91f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-manual"

RDEPENDS:${PN} += ""

inherit rpm
