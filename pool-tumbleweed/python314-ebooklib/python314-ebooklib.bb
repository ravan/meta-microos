SUMMARY = "Ebook library which can handle EPUB2/EPUB3 format"
DESCRIPTION = "Ebook library which can handle EPUB2/EPUB3 format."
LICENSE = "AGPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "python314-ebooklib-0.20-1.4.noarch.rpm"
RPM_HASH = "647461895759a82b3d6ff51debb707ac87ee4fdb2d1edd8ac1590c584c236feabcfce8dcabe37b6824a1e7f20eac67b8aa278fc9b5130442160601ce5ad247d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ebooklib \
python314-ebooklib \
python3dist-ebooklib"

RDEPENDS:${PN} += "python-abi \
python314-lxml"

inherit rpm
