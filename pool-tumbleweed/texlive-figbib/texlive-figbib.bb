SUMMARY = "Organize figure databases with BibTeX"
DESCRIPTION = "FigBib lets you organize your figures in BibTeX databases. Some \
FigBib features are: Store and manage figures in a BibTeX \
database; Include figures in your LaTeX document with one short \
command; Generate a List of Figures containing more/other \
information than the figure captions; Control with one switch \
where to output the figures, either as usual float objects or \
in a separate part at the end of your document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19388"

RPM_NAME = "texlive-figbib-2026.226.svn19388-59.2.noarch.rpm"
RPM_HASH = "c992ff074f482e6669e47725d5f9097e9ab2acd290e2e959e9afb769fcd9f5cf5593091bfb9655512851b38bf51904df3b53324bc6be5d9716cb24da148f4817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figbib.sty \
texlive-figbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epsfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
