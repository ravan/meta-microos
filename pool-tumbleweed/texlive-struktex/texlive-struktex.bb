SUMMARY = "Draw Nassi-Shneiderman charts"
DESCRIPTION = "Even in the age of OOP one must develop algorithms. \
Nassi-Shneiderman charts are a well known tool to describe an \
algorithm in a graphical way. The package offers some macros \
for generating those charts in a LaTeX document. The package \
provides the most important elements of a Nassi-Shneiderman \
charts, including processing blocks, loops, mapping conventions \
for alternatives, etc. The charts are drawn using the picture \
environment (using pict2e for preference)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0asvn75565"

RPM_NAME = "texlive-struktex-2026.226.3.0asvn75565-64.2.noarch.rpm"
RPM_HASH = "b5b3dd3be0f5845d3c474d0d386279fecc88418c1c96ef2d867dd1f169dab5bd8412149094008b374e9689ddf4476962ff132f416c985c8f8fd33a3055ae1818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-strukdoc.sty \
tex-struktex.sty \
tex-struktxf.sty \
tex-struktxp.sty \
texlive-struktex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-color.sty \
tex-curves.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-pict2e.sty \
tex-url.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
