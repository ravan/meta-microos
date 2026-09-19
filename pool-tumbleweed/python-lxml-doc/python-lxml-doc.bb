SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "python-lxml-doc-6.1.1-2.2.noarch.rpm"
RPM_HASH = "8fa09c4addbb1f5b9222d1f08d475cd15ba711dbb5ff016bb9ff54b1b2d354de41091f9458b12fa2ba2622e158382c2defefee250ca6dca9929622ed5a438544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
