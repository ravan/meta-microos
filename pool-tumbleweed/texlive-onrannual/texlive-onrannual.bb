SUMMARY = "Class for Office of Naval Research Ocean Battlespace Sensing annual report"
DESCRIPTION = "This is an unofficial document class for writing ONR annual \
reports using LaTeX; as ONR has had numerous problems with \
LaTeX-generated PDF submissions in the past. A skeleton \
document (and its PDF output) are included."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn17474"

RPM_NAME = "texlive-onrannual-2026.226.1.1svn17474-61.2.noarch.rpm"
RPM_HASH = "b7170fd8d6dc739726899b0cd2ea5e518f2fa9f763b8611c797afcf61a8f2277f23d4be6530ed61bd95529db6bffbae7a16e9239590209c85355c8778590ed32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onrannual.cls \
texlive-onrannual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-authblk.sty \
tex-caption.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-mathptmx.sty \
tex-parskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
