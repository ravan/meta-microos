SUMMARY = "Translation of man pages in Polish"
DESCRIPTION = "This package provides translations of man pages in Polish."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-pl-4.31.0-1.2.noarch.rpm"
RPM_HASH = "b945c941bf17589d0c29c8f453b6ce199974c826d4b71e3f5ebac4432a66e03a67a6cf4f0b2a1f2003bad4ebefa20c9a9463ddcb35d49e6a79ae09da3c9675c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-pl \
man-pages-pl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
