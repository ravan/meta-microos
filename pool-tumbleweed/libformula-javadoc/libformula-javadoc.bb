SUMMARY = "Javadoc for libformula"
DESCRIPTION = "Javadoc for libformula."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "72d17d4245a896840d86ce93be3e4685f5e0c5e97dc88d8fed92fb4c4de6e5f7218e0e8c4bf8ed9be7489944a747ad9573cfb81df4ef3e492871de072144a3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
