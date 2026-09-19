SUMMARY = "A versatile book class"
DESCRIPTION = "This class is intended to be an interpretation of the mwbk \
class which is a part of the mwcls package. The mwcls classes \
are simple, yet powerful and customizable classes that allow \
the end-user to customize the layout of headers, headings etc. \
They also have the benefit of being more economic in space than \
the most common LaTeX classes, while keeping a clear appearance \
and a smooth flow."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46201"

RPM_NAME = "texlive-ycbook-2026.226.svn46201-59.4.noarch.rpm"
RPM_HASH = "c2f92a468a52837852ab323741b6a064ea5ad0a1f312b6b66118f66bcf4e832295c11033b3c2390353c353fcdc92b7066eb828540e8bbeaec6ac79c3a38e1d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ycbook.cls \
texlive-ycbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-booktabs.sty \
tex-changepage.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-placeins.sty \
tex-polyglossia.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
