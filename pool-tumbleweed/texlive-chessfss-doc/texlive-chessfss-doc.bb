SUMMARY = "Documentation for texlive-chessfss"
DESCRIPTION = "This package includes the documentation for texlive-chessfss"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn78101"

RPM_NAME = "texlive-chessfss-doc-2026.226.1.2asvn78101-60.2.noarch.rpm"
RPM_HASH = "87d5102f6a05575f16995b5cbe41b7b308f0877be7f2bbcfb84e6988d3554660519ee273cb612122e054fa8e042f200fe65e4c1f164f8171f5569e1b46d9e0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
