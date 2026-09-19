SUMMARY = "Translation of man pages in Indonesian"
DESCRIPTION = "This package provides translations of man pages in Indonesian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-id-4.31.0-1.2.noarch.rpm"
RPM_HASH = "d89c223c01e1787be07d030e2d289c2282ba41220ef6e00be79e20627d3bd819bdb25e80ea3289137eb7cdfe0269a81db1eda1eb33d1d342f620309780277216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-id \
man-pages-id"

RDEPENDS:${PN} += "man-pages"

inherit rpm
