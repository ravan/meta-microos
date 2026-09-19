SUMMARY = "Documentation for texlive-biblatex-nottsclassic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nottsclassic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-doc-2026.226.0.0.1svn41596-61.2.noarch.rpm"
RPM_HASH = "06a7330d06b629cc4145942dae748428378094f1b454d68aee1817e8bbdcf64ba804bffad189d143741eb302c0fda5fb4ba2057b37ddf083568a901a9cf8742f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nottsclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
