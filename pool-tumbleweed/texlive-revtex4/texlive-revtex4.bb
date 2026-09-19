SUMMARY = "Styles for various Physics Journals (old version)"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0asvn56589"

RPM_NAME = "texlive-revtex4-2026.226.4.0asvn56589-60.4.noarch.rpm"
RPM_HASH = "8e5de98946c73bed7a2a4b336502537a95cce0c3c8a8caece6e8818009c5ac17848b82b3ffadd4c67a285c0e62d6544365387baf25b16f188de0d5bd8035c966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-10pt.rtx \
tex-11pt.rtx \
tex-12pt.rtx \
tex-aps.rtx \
tex-revsymb.sty \
tex-revtex4.cls \
tex-rmp.rtx \
texlive-revtex4"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-natbib.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
