SUMMARY = "Translation of man pages in Arabic"
DESCRIPTION = "This package provides translations of man pages in Arabic."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-ar-4.31.0-1.2.noarch.rpm"
RPM_HASH = "87ee6cb61fe4a1bb8fe19835601231401c19948fdc356dffd99d4c638835769c1efa3697cb62b8358dacf5351320d71186df679ae773fdb9205c7e6db14038f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ar \
man-pages-ar"

RDEPENDS:${PN} += "man-pages"

inherit rpm
