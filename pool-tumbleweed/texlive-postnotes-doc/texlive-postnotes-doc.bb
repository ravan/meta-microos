SUMMARY = "Documentation for texlive-postnotes"
DESCRIPTION = "This package includes the documentation for texlive-postnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn77682"

RPM_NAME = "texlive-postnotes-doc-2026.226.0.0.5.1svn77682-59.2.noarch.rpm"
RPM_HASH = "e1ceb5b937ce3150605518303daba54f21882b30b88cffb90621056607092c8a9d95f2f82280c28b033b7921a29fa7e83aa02dadabd56529ef98f4ef2a81b603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
