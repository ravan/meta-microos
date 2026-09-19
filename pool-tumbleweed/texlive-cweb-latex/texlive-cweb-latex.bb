SUMMARY = "A LaTeX version of CWEB"
DESCRIPTION = "This bundle allows marking-up of CWEB code in LaTeX. The \
distribution includes the 'Counting Words' program distributed \
with CWEB, edited to run with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn28878"

RPM_NAME = "texlive-cweb-latex-2026.226.svn28878-61.2.noarch.rpm"
RPM_HASH = "703949618ba0be44a5d37dbe0956c7038bd90480d155d96dfa860e9ad3d2cd5ff565f0f023fcd7ea4c7535c851a08cd1f396c5114656981bf34d2485dec7249a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cwbl-german.sty \
tex-cweb.cls \
tex-cwebarray.sty \
tex-cwebbase.tex \
tex-keyvald.sty \
texlive-cweb-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
