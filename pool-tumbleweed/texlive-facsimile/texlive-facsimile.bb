SUMMARY = "Document class for preparing faxes"
DESCRIPTION = "The facsimile class provides a simple interface for creating a \
document for sending as a fax, with LaTeX. The class covers two \
areas: First, a title page is created with a detailed fax \
header; second, every page gets headers and footers so that the \
recipient can be sure that every page has been received and all \
pages are complete, and in the correct order. The class evolved \
from the fax package, and provides much better language \
support."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21328"

RPM_NAME = "texlive-facsimile-2026.226.1.0svn21328-59.2.noarch.rpm"
RPM_HASH = "bf68dbfe69960eb94cd70a1eb99181cafb689bf574ae64c5ec91ecb306ab3f56783a18b9e4c9be0cdd7ec11cf8bc82c13172dc8489f2e695e7405e131b0e65a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fac-de.cfg \
tex-fac-en.cfg \
tex-facsimile.cls \
texlive-facsimile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
