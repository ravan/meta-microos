SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-cssselect-1.5.0-1.1.noarch.rpm"
RPM_HASH = "dce9768dab1331441b1874dc831ea0b286648b58c1b08058aed12cb5b4de1d78e2850b17aab370a99367acaef8563a93ce65bd30a6cd880be323986a29e4d668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cssselect \
python314-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
