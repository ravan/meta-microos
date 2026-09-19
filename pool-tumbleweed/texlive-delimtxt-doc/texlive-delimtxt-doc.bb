SUMMARY = "Documentation for texlive-delimtxt"
DESCRIPTION = "This package includes the documentation for texlive-delimtxt"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn16549"

RPM_NAME = "texlive-delimtxt-doc-2026.226.svn16549-59.2.noarch.rpm"
RPM_HASH = "f48a8244df3de7d83a1ab821bd9bff5e2442948ac8df61066a03fde9c2a1b514f1d6122566612fbaf1ab7b776a61c59af0b8329272ab6b3a98253ea521bd21ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimtxt-doc"

RDEPENDS:${PN} += ""

inherit rpm
