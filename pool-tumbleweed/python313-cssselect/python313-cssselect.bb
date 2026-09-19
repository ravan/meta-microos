SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-cssselect-1.5.0-1.1.noarch.rpm"
RPM_HASH = "46ed27c4692cf2a50e037ba785e0f581eeba84d4ebe72d609a5fef828d27e9b91c45d7f55194cf4eebf7b458eeec8f73a81200ac735b76312f2833de72aac753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect \
python3.13dist-cssselect \
python313-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
