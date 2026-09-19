SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "python314-parsel-1.11.0-1.4.noarch.rpm"
RPM_HASH = "14daaed008bb022a1f8e69d89a4066d2d7ce2dac9d935ce4ff48981e00415cc8dfde58494c8dc181a2121f2ce4cd19598972025f67821a86d6e727f143a3f8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parsel \
python314-parsel \
python3dist-parsel"

RDEPENDS:${PN} += "python-abi \
python314-cssselect \
python314-jmespath \
python314-lxml \
python314-packaging \
python314-w3lib"

inherit rpm
