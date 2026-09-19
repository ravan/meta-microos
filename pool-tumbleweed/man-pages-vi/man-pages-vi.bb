SUMMARY = "Translation of man pages in Vietnamese"
DESCRIPTION = "This package provides translations of man pages in Vietnamese."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-vi-4.31.0-1.2.noarch.rpm"
RPM_HASH = "ee427340ffa3e0173d090f9a60bad58b0510148d37a20b2a1f43193892f1fad2c770df95519e83a8d96e59324d1f1780a4009fa55dfdb4b82d71660540787fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-vi \
man-pages-vi"

RDEPENDS:${PN} += "man-pages"

inherit rpm
