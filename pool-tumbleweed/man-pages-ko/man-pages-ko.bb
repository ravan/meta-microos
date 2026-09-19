SUMMARY = "Translation of man pages in Korean"
DESCRIPTION = "This package provides translations of man pages in Korean."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-ko-4.31.0-1.2.noarch.rpm"
RPM_HASH = "b35937c5f67b561837cf3aeafd9568f24d71dfb92a46854dead612cd56857406235fe39152ac59738bbed9fecf54b1ba47d14fbdae8c46552d4c005ace5f7628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ko \
man-pages-ko"

RDEPENDS:${PN} += "man-pages"

inherit rpm
