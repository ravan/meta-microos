SUMMARY = "Documentation for texlive-arara"
DESCRIPTION = "This package includes the documentation for texlive-arara"
LICENSE = "BSD-3-Clause"

PV = "2026.226.7.2.0svn75653"

RPM_NAME = "texlive-arara-doc-2026.226.7.2.0svn75653-61.2.noarch.rpm"
RPM_HASH = "bfc69e22ba24720290657381f8692fda71f3a3c79f60b2ace2d97ac7837c37884574f32892defbc1a19294698ced07389ff7fa0cdae26f66d03118dcf0254b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-arara.1 \
texlive-arara-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
