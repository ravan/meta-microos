SUMMARY = "Translation of man pages in Finnish"
DESCRIPTION = "This package provides translations of man pages in Finnish."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-fi-4.31.0-1.2.noarch.rpm"
RPM_HASH = "b9f467c33d26a41760e8a882b4a1fbf13dbfbd8e0669aad43cd802f65ec811f7caf27670b071cb98d2eddfc1baacc298a0989899abfc2e34e1d8509f2ba7dc6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-fi \
man-pages-fi"

RDEPENDS:${PN} += "man-pages"

inherit rpm
