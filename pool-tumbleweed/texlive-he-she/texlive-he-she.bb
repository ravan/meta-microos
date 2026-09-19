SUMMARY = "Alternating pronouns to aid gender-neutral writing"
DESCRIPTION = "The package implements a version of semi-automatic pronoun \
switching for writing gender-neutral (and possibly annoying) \
prose. It has upper- and lowercase versions of switching \
pronouns for all case forms, plus anaphoric versions that \
reflect the current gender choice."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn41359"

RPM_NAME = "texlive-he-she-2026.226.1.3svn41359-60.4.noarch.rpm"
RPM_HASH = "e321cae6a1ccc2b2b910b636addeefe79cdb127ef84d8d40c5d00f163e19cf5515a137c6a83f3a8e8eb9ee0bf09b8ad189d5e096d1e637884641f32db89154e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-he-she.sty \
texlive-he-she"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyhook.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
