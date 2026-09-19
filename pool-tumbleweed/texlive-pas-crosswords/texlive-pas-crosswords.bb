SUMMARY = "Creating crossword grids, using TikZ"
DESCRIPTION = "The package produces crossword grids, using a wide variety of \
colours and decorations of the grids and the text in them. The \
package uses TikZ for its graphical output."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-2026.226.1.03svn32313-58.2.noarch.rpm"
RPM_HASH = "7ee41a91930c6844199ef6c02cc0f9ec0456c7c2334e0e5f14814b12de91cdf052a4f178197b70a2c145a5d2ae6d3514c898ac17b12e3b20ec2bc7d2671bfa5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pas-crosswords.sty \
texlive-pas-crosswords"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-multido.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
