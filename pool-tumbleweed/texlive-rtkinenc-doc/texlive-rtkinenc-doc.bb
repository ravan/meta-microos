SUMMARY = "Documentation for texlive-rtkinenc"
DESCRIPTION = "This package includes the documentation for texlive-rtkinenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-rtkinenc-doc-2026.226.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "e6082ecb3b54776ab125af4b3a758148b40c4cb313d91205576907e964aedf5fe50f6eaa723c27021eefcd61710967c152baae9c2cc22e5c74e6ada11b670c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rtkinenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
