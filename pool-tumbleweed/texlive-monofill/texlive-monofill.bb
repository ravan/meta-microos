SUMMARY = "Alignment of plain text"
DESCRIPTION = "The package provides horizontal alignment, as in the LaTeX \
command \\listfiles (or the author's longnamefilelist package). \
Uses may include in-text tables, or even code listings."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn28140"

RPM_NAME = "texlive-monofill-2026.226.0.0.2svn28140-61.2.noarch.rpm"
RPM_HASH = "580724bbc6bde4646ddf02f964b665e0e1935cfbf3a49c05274adc0d3efd915f75252a22ea5eb60b3b82e4185d60c145e5813afddf0ac4a89e6422b50936beda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-monofill.sty \
texlive-monofill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
