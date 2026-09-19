SUMMARY = "Documentation for texlive-biblatex-arthistory-bonn"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-arthistory-bonn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-doc-2026.226.1.2svn46637-61.2.noarch.rpm"
RPM_HASH = "4efb2b430ab1418cef36e7d118cc163a67a1f1e50b4f95371e82d665b98ac3b274c6aafe52e4055dfd00f698bd5ae4e3fbf80eff4ca6d2f683a17f6c8f501e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-arthistory-bonn-doc"

RDEPENDS:${PN} += ""

inherit rpm
