SUMMARY = "Manage classical manuscripts with BibLaTeX"
DESCRIPTION = "The package adds a new entry type: @manuscript to manage \
manuscript in classical philology, for example to prepare a \
critical edition."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.4svn66977"

RPM_NAME = "texlive-biblatex-manuscripts-philology-2026.226.2.1.4svn66977-61.2.noarch.rpm"
RPM_HASH = "16a8150661904d3b2516a5c1a6638ff13bbe011b77a8c3545ee1a2032ee7586bdb495099380516037e330b7d7fd8c147fd2dce2facb3042a25b0b1a3304ae1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-manuscripts.lbx \
tex-french-manuscripts.lbx \
tex-italian-manuscripts.lbx \
tex-latin-manuscripts.lbx \
tex-manuscripts-NewBibliographyString.sty \
tex-manuscripts-noautoshorthand.bbx \
tex-manuscripts-shared.bbx \
tex-manuscripts.bbx \
texlive-biblatex-manuscripts-philology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-italian.lbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
