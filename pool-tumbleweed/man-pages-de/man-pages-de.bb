SUMMARY = "Translation of man pages in German"
DESCRIPTION = "This package provides translations of man pages in German."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-de-4.31.0-1.2.noarch.rpm"
RPM_HASH = "133e0e6f3b12ee382798ed044b01e3ba71ba67bf3d5ffa685e4828c2ec3620f4a5fe2dea443ac37c54a857f9ab934ee87ece17660083ad1b427f9a6f95a7c341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-de \
man-pages-de"

RDEPENDS:${PN} += "man-pages"

inherit rpm
