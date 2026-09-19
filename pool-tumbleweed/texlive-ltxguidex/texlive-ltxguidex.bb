SUMMARY = "An extended ltxguide class"
DESCRIPTION = "The ltxguidex document class extends ltxguide with a set of \
environments and commands that make writing beautiful LaTeX \
documentation easier and more natural."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-2026.226.0.0.2.0svn50992-59.2.noarch.rpm"
RPM_HASH = "e5135c163246b14f0685c43e1e9e1d1484ec13a963f1a1ebf304d5b4a24c578f6bfd797680837fedb07ec1829914edf8ca95ad9ca57c8fbb9bccbb5ad189f220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxguidex.cls \
texlive-ltxguidex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-framed.sty \
tex-hyperref.sty \
tex-ltxguide.cls \
tex-showexpl.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
