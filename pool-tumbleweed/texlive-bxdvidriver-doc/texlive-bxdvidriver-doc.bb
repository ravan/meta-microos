SUMMARY = "Documentation for texlive-bxdvidriver"
DESCRIPTION = "This package includes the documentation for texlive-bxdvidriver"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-doc-2026.226.0.0.2asvn43219-59.2.noarch.rpm"
RPM_HASH = "d582d6d30c97117b8300e35a45960e89ebb694cd730ff2dd632b9a3519bf138005c748bfc830f2ed447d685825cbbd6abafcfbc5af905feda72f116fd2076118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdvidriver-doc"

RDEPENDS:${PN} += ""

inherit rpm
