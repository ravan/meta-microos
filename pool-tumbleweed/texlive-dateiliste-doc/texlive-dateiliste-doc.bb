SUMMARY = "Documentation for texlive-dateiliste"
DESCRIPTION = "This package includes the documentation for texlive-dateiliste"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-doc-2026.226.0.0.6svn27974-61.2.noarch.rpm"
RPM_HASH = "c99afbde328614790b6270765dffa68fb6db87978190fd4c04154bd54d97d610a8d8cacc040288b64492fe3c625a8d5f880b027986f24bb6cd38bb7c50eddc47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dateiliste-doc-de;en;eo \
texlive-dateiliste-doc"

RDEPENDS:${PN} += ""

inherit rpm
