SUMMARY = "Tool for making eBooks from stories on fanfiction and other web sites"
DESCRIPTION = "FanFicFare is a tool for downloading fanfiction and original stories from various sites into ebook form. \
 \
FanFicFare is the rename and move of the FanFictionDownLoader (AKA FFDL, AKA fanficdownloader) project. \
 \
Main Features of FanFicFare: \
    - Download fanfiction stories from various sites into ebooks. \
    - Create various ebook formats (currently epub, mobi, HTML, txt) \
    - Also available as a Calibre plugin (not in this package) \
    - Ability to update already downloaded book"
LICENSE = "GPL-3.0-only"

PV = "4.61.0"

RPM_NAME = "fanficfare-4.61.0-1.1.noarch.rpm"
RPM_HASH = "be881195eafa7ead240a81e82619365bd31ec0e51ad19ad3c86bb0cf80103d4ccbdcf4575b98ffde0c1bf20a69a891d6db50fe5bbd3f3a63176474935e61bc5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fanficfare \
python3-fanficfare \
python3.13dist-fanficfare \
python311-fanficfare \
python313-fanficfare \
python314-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Brotli \
python3-apsw \
python3-beautifulsoup4 \
python3-chardet \
python3-cloudscraper \
python3-html2text \
python3-html5lib \
python3-requests \
python3-requests-file \
python3-urllib3"

inherit rpm
