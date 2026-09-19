SUMMARY = "Translation of man pages in Swedish"
DESCRIPTION = "This package provides translations of man pages in Swedish."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-sv-4.31.0-1.2.noarch.rpm"
RPM_HASH = "cac19d85a914deb52b212ae0c8955e80aa5d43afe23ab93416e0e3c302d14760646fcc0eb4e9d1a6a1bf94fe4cc1ab28b16884f21a32b3f4753eb2c9a4fe8d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-sv \
man-pages-sv"

RDEPENDS:${PN} += "man-pages"

inherit rpm
