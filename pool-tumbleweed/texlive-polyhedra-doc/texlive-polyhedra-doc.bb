SUMMARY = "Documentation for texlive-polyhedra"
DESCRIPTION = "This package includes the documentation for texlive-polyhedra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn68770"

RPM_NAME = "texlive-polyhedra-doc-2026.226.0.0.3svn68770-59.2.noarch.rpm"
RPM_HASH = "ecb7d6e89ce7ed997266a273f6d8904b1e74c218dcb67b770eb1c8b0979e5b3e5237dcfcfb7673440bebf7aad601eb2553ee3f9707269ed459076a11129a4c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polyhedra-doc"

RDEPENDS:${PN} += ""

inherit rpm
