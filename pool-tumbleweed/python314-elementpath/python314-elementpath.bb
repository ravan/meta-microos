SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "5.1.4"

RPM_NAME = "python314-elementpath-5.1.4-1.1.noarch.rpm"
RPM_HASH = "506f765abbb4ed1e175215c3c6e84a309155e5ee2d7e6286760f79da2b11aa95f2fc3de7ac6ed5137c80e789afc8698bf38f39d7e0f69d150fed5b3599fdc015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-elementpath \
python314-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
