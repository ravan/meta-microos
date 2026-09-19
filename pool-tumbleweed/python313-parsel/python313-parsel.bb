SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "python313-parsel-1.11.0-1.4.noarch.rpm"
RPM_HASH = "cb3a874a21a43ea96140104b19bf51709c7657ae6a977a06a98d6e0f41486e1a0be725031b5953d1aedb0c8c42b1a63743ec6aeb9fa706ce12de2ac1e7f53a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsel \
python3.13dist-parsel \
python313-parsel \
python3dist-parsel"

RDEPENDS:${PN} += "python-abi \
python313-cssselect \
python313-jmespath \
python313-lxml \
python313-packaging \
python313-w3lib"

inherit rpm
