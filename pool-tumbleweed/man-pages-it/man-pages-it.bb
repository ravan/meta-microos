SUMMARY = "Translation of man pages in Italian"
DESCRIPTION = "This package provides translations of man pages in Italian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-it-4.31.0-1.2.noarch.rpm"
RPM_HASH = "24d29a5e925a04be150b813b5fbf3a40a7134e7b9557bb4c874d2f8ac694ca2274732d2ace549c6817aaa2c7ec8dfe6d1b150787d44b1d0f4822bc68cd4c301a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-it \
man-pages-it"

RDEPENDS:${PN} += "man-pages"

inherit rpm
