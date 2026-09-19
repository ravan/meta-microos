SUMMARY = "Translation of man pages in Czech"
DESCRIPTION = "This package provides translations of man pages in Czech."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-cs-4.31.0-1.2.noarch.rpm"
RPM_HASH = "b78cac0d2352b5f02ad12d96c3f23f9cff318d1345d625f672ee68dfdb5e12c570259c9a0d6c7d2a2d1cc2860c9e393587531b0ce8fbdb6011e806526c5fd607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-cs \
man-pages-cs"

RDEPENDS:${PN} += "man-pages"

inherit rpm
