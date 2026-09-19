SUMMARY = "Qt based ebook reader"
DESCRIPTION = " \
Currently supports: \
 \
* pdf \
* epub \
* mobi \
* azw / azw3 / azw4 \
* cbr / cbz"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "lector-0.5.1-3.7.noarch.rpm"
RPM_HASH = "75ed4e32b52bdfa6a4f4cb2d23f9663e2c34e0889fdca4b22ee7a61d2238f02300945d7c5d0229cac20ec88b4c4c78ca091f03c88af947ff7196519faf69758c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lector \
python3.13dist-lector \
python3dist-lector"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3 \
python3-beautifulsoup4 \
python3-lxml \
python3-qt5 \
python3-xmltodict"

inherit rpm
