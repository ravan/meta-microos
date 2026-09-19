SUMMARY = "Documentation for texlive-fancypar"
DESCRIPTION = "This package includes the documentation for texlive-fancypar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-fancypar-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "5348db80f5582b3d1f9822d7037de24a2eb810cd3f4127e4f194bfc57d15b9d997528f379e2b0823a2f4ae6efc0013b88302c888b666016141e4ee81c519153a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancypar-doc"

RDEPENDS:${PN} += ""

inherit rpm
