SUMMARY = "Documentation for texlive-alnumsec"
DESCRIPTION = "This package includes the documentation for texlive-alnumsec"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn77682"

RPM_NAME = "texlive-alnumsec-doc-2026.226.0.0.03svn77682-61.2.noarch.rpm"
RPM_HASH = "eee9456815dc53fa600bfbe4252503af45b3276ea10bf8ee73be1b8a2ff6a7baea334c9033f35d89552c7aa0496ee5f7a1951c31e6c430ba1fa5754e6ced8c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alnumsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
