SUMMARY = "Shlomi Fish's gnu11 C Library of Random headers"
DESCRIPTION = "Shlomi Fish's gnu11 C Library of Random headers."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "rinutils-devel-0.10.3-1.2.noarch.rpm"
RPM_HASH = "64f766fe8decd5f53a41aa5d7a3f7f55a3620f2b91add192ea1253db1bc97b9dca2f3e95cdb784c5a3ca1df78a8587f478d321b063c164034633086b626e5684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Rinutils \
pkgconfig-librinutils \
rinutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
