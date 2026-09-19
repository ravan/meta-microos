SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-html-3.0.5-2.2.noarch.rpm"
RPM_HASH = "9c45cacafdda424a7c25a3bb50814a07d0af96b7d81c7b005874a702718329f35b2a91c01d5dd2047649d19629cae30367085b34824218b89f69165c228d5620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-html \
python313-pandas-html"

RDEPENDS:${PN} += "python313-beautifulsoup4 \
python313-html5lib \
python313-lxml \
python313-pandas"

inherit rpm
