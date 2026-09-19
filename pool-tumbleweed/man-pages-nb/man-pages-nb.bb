SUMMARY = "Translation of man pages in Norwegian Bokmål"
DESCRIPTION = "This package provides translations of man pages in Norwegian Bokmål."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-nb-4.31.0-1.2.noarch.rpm"
RPM_HASH = "ad524d8d1ff46f0d08947f47a26f332f35e3f39d7d60ae855171a04843efa363799e4c6b53ed49040d606ddf884f9a5eee9dbdf0c01d0dfcdb124517e9969a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-nb \
man-pages-nb"

RDEPENDS:${PN} += "man-pages"

inherit rpm
