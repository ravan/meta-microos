SUMMARY = "Translation of man pages in French"
DESCRIPTION = "This package provides translations of man pages in French."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-fr-4.31.0-1.2.noarch.rpm"
RPM_HASH = "f4799cb48baccf79d1c498cc23b11b8570cba485a1b22b2ee802c9cc33b68d4e624e3d0a00fcd32b1deb313049ecc995243abfc43bf48293106c2df17cf82998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-fr \
man-pages-fr"

RDEPENDS:${PN} += "man-pages"

inherit rpm
