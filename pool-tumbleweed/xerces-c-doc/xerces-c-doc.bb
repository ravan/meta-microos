SUMMARY = "Documentation for xerces-c"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces). \
 \
This package contains just documentation."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "xerces-c-doc-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "136208f1ccf059b78babdcd6aa9e0026736d9c98739978a824b27c9bab4a3b8428e000cc42cc22bd175da776d7c77a2431541f93946d918b02570109aa9ea595"

RPROVIDES:${PN} += "xerces-c-doc"

RDEPENDS:${PN} += ""

inherit rpm
