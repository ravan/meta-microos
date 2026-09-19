SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-2026.226.4.1ssvn56590-60.4.noarch.rpm"
RPM_HASH = "16655985b9e042db5b7bf2a1ca74cb3b7380e4e859a7e6dc1a27c1f7f45c8b4e675a28d70b10a174b091686b5552adbaf49087b65a9a245a48f42ffea2429659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aip4-1.rtx \
tex-aps10pt4-1.rtx \
tex-aps11pt4-1.rtx \
tex-aps12pt4-1.rtx \
tex-aps4-1.rtx \
tex-apsrmp4-1.rtx \
tex-revsymb4-1.sty \
tex-revtex4-1.cls \
texlive-revtex4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fleqn.clo \
tex-hyperref.sty \
tex-lineno.sty \
tex-natbib.sty \
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
