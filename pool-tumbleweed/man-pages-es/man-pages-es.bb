SUMMARY = "Translation of man pages in Spanish"
DESCRIPTION = "This package provides translations of man pages in Spanish."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-es-4.31.0-1.2.noarch.rpm"
RPM_HASH = "fe0f0077f3e4a7c0f458e44d1adec716fd95e03728916e4fa5cb89b37f64a8958a91ee9b2214bdf6109f935d48bdc0852afa16bc7586ef85c146da5a4a8496fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-es \
man-pages-es"

RDEPENDS:${PN} += "man-pages"

inherit rpm
