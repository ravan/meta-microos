SUMMARY = "Translation of man pages in Russian"
DESCRIPTION = "This package provides translations of man pages in Russian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-ru-4.31.0-1.2.noarch.rpm"
RPM_HASH = "21c94d63503d4656e918896915c4b7ba106ba32d88f98dff62fe06bf6805e2f5a9a1ffaff230ddaf18174406ab6cc7061486e2151bd36dfd644c963db0d629f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ru \
man-pages-ru"

RDEPENDS:${PN} += "man-pages"

inherit rpm
