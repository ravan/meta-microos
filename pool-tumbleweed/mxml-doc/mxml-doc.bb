SUMMARY = "Documentation for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the HTML documentation for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "mxml-doc-3.3.1-1.13.noarch.rpm"
RPM_HASH = "759f299ceb154ec95e574304a187fa5e5167688eea76154ed2c13ada08a9ba8bd59ffc6b432847aaad9b08466e23c1c273eeb3c7a35c5a88c67579afa2c802fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
