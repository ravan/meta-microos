SUMMARY = "Documentation for texlive-scikgtex"
DESCRIPTION = "This package includes the documentation for texlive-scikgtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn66764"

RPM_NAME = "texlive-scikgtex-doc-2026.226.2.2.0svn66764-60.2.noarch.rpm"
RPM_HASH = "bce17a0ad34a9500cc0eae2654c75e75295ae546b4fd5abf499106aaf6c5f736d806cc08f90164ffb3fb2b8d83c019a21047d04fd07071de09441b0a257017c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scikgtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
