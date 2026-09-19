SUMMARY = "Developer files for poppler-data"
DESCRIPTION = "This package contains the pkgconfig file for poppler-data."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only"

PV = "0.4.12"

RPM_NAME = "poppler-data-devel-0.4.12-1.9.noarch.rpm"
RPM_HASH = "d1e02c1048e4e203a4179bb2d75933728c5fac407b0dcb29743acd31524e388e7aff7938f5b59dc3a244741294e3cdba4c5ec6eb8877a9311c197c9c237cb5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-poppler-data \
poppler-data-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
poppler-data"

inherit rpm
