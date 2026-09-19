SUMMARY = "Translation of man pages in Brazilian Portuguese"
DESCRIPTION = "This package provides translations of man pages in Brazilian Portuguese."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-pt_BR-4.31.0-1.2.noarch.rpm"
RPM_HASH = "5b7ba5d5be9057781f42ddf62817232001f3fb95897243cdea1a05e369c0866d9f588caff3bedea80af6d26414ea3d12839bb22745d654fbe6ab55f1f585631f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-pt-BR \
man-pages-pt-BR"

RDEPENDS:${PN} += "man-pages"

inherit rpm
