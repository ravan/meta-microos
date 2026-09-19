SUMMARY = "Translation of man pages in Hungarian"
DESCRIPTION = "This package provides translations of man pages in Hungarian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-hu-4.31.0-1.2.noarch.rpm"
RPM_HASH = "85cd806949edcf05ae2a04f5483cc5fe9e0cd1288c415e1bbc58795adce14e17da7febbcce9e054f15b4d1e724f727615378ad3091c07b8b0f73bdd953d817ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-hu \
man-pages-hu"

RDEPENDS:${PN} += "man-pages"

inherit rpm
