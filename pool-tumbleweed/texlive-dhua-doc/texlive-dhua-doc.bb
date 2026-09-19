SUMMARY = "Documentation for texlive-dhua"
DESCRIPTION = "This package includes the documentation for texlive-dhua"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn24035"

RPM_NAME = "texlive-dhua-doc-2026.226.0.0.11svn24035-59.2.noarch.rpm"
RPM_HASH = "2ecfbc2d063b6d591092b0c6408aff372d90f8b1e00789459b469baaf68b2c118f65c56c8637de38331ff0dd90168458052a20de2e0987d395f2130312389867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dhua-doc"

RDEPENDS:${PN} += ""

inherit rpm
