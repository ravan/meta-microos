SUMMARY = "Produces a standard US invoice from a CSV file"
DESCRIPTION = "This class produces a standard US commercial invoice using data \
from a CSV file. Invoices can span multiple pages. The class is \
configurable for different shipping addresses."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn49749"

RPM_NAME = "texlive-invoice-class-2026.226.1.0svn49749-60.2.noarch.rpm"
RPM_HASH = "f69b9382a6e9fa514ef0f360ea154b881d8749baba96d5ca903ea4f099d690b2b5dc23789998319956f9ea18ab89d162a72a918de0756ba7532e03228d5a2943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice-class.cls \
texlive-invoice-class"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-datatool.sty \
tex-dcolumn.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
