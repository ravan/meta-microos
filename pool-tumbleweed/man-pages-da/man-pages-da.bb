SUMMARY = "Translation of man pages in Danish"
DESCRIPTION = "This package provides translations of man pages in Danish."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-da-4.31.0-1.2.noarch.rpm"
RPM_HASH = "def0867c999f05be9ba2bc6c09c53d5eec7d806705219c89f629969fb9da4bf0c20b0a6023bdaa39404d1183ba714e33ebe03b2b341e41798f9db439588c57d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-da \
man-pages-da"

RDEPENDS:${PN} += "man-pages"

inherit rpm
