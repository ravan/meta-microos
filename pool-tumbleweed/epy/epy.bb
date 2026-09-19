SUMMARY = "CLI ebook reader"
DESCRIPTION = "CLI Ebook reader. Fork of epr with these extra features: \
 \
    Supported formats: \
        Epub (.epub, .epub3) \
        FictionBook (.fb2) \
        Mobi (.mobi) \
        AZW3 (.azw3), some but not all \
 \
    Reading progress percentage \
    Bookmarks \
    External dictionary integration (sdcv or dict) \
    Inline formats: bold and italic (depend on terminal and font \
        capability. Italic only supported in python>=3.7) \
    Text-to-Speech (with additional setup) \
    Double Spread"
LICENSE = "GPL-3.0-only"

PV = "2025.5.27+git.1753549454.05f4e66"

RPM_NAME = "epy-2025.5.27+git.1753549454.05f4e66-1.4.noarch.rpm"
RPM_HASH = "48059d510efe1bb64265bec0748c5d4bafd89f63993cb5f2b9289ca9e865393a3c9fd2036a6c2c15f2af5943ca00395a68bcf34d5fd2854799181cd007eae5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epy \
python3.13dist-epy-reader \
python3dist-epy-reader"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-curses \
python3-standard-imghdr"

inherit rpm
