SUMMARY = "Documentation macros for the TKZ series of packages"
DESCRIPTION = "This bundle offers a documentation class (tkz-doc) and a \
package (tkzexample). These files are used in the documentation \
of the author's packages tkz-base, tkz-euclide, tkz-fct, \
tkz-linknodes, and tkz-tab."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45csvn68665"

RPM_NAME = "texlive-tkz-doc-2026.226.1.45csvn68665-59.2.noarch.rpm"
RPM_HASH = "cc9216294ca522008cfe0ecf37e18b11cf67fe3bfed5edae844a6394bbecb5f5c13e4c9a2f1272f5a21cc333516e7d853045e76184b7610693570f0d01749891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-doc.cfg \
tex-tkz-doc.cls \
texlive-tkz-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-cellspace.sty \
tex-datetime.sty \
tex-eso-pic.sty \
tex-footmisc.sty \
tex-framed.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
