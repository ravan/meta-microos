SUMMARY = "Translation of man pages in Greek"
DESCRIPTION = "This package provides translations of man pages in Greek."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-el-4.31.0-1.2.noarch.rpm"
RPM_HASH = "f51112a48db571897dcfcc53d7982d3411a44b6a0188918741f7dbe346fa4b4deba177f0c50a29c65af35e6115137af5eb64fe12a698aece79394ba8db90972c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-el \
man-pages-el"

RDEPENDS:${PN} += "man-pages"

inherit rpm
