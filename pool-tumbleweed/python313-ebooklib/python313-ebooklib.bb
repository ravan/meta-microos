SUMMARY = "Ebook library which can handle EPUB2/EPUB3 format"
DESCRIPTION = "Ebook library which can handle EPUB2/EPUB3 format."
LICENSE = "AGPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "python313-ebooklib-0.20-1.4.noarch.rpm"
RPM_HASH = "c65be5f28d8addf871f03404e6c3dccd7043a915937cb31e18e167dd799c905dd193f31cb8d30931c7b9e6f1707ff24ceac7c0e09b9b768f17e342cda38d743f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ebooklib \
python3.13dist-ebooklib \
python313-ebooklib \
python3dist-ebooklib"

RDEPENDS:${PN} += "python-abi \
python313-lxml"

inherit rpm
