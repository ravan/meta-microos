SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "5.1.4"

RPM_NAME = "python313-elementpath-5.1.4-1.1.noarch.rpm"
RPM_HASH = "f3138c3d40d411341027d4ca190ae57f7e0852f66fa0d34b710c59162923444455225c7ae151087fdbf29fa95c3b6768dca4fd4754b47eef6ca46fa9fa3a2278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elementpath \
python3.13dist-elementpath \
python313-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
