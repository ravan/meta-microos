SUMMARY = "A double-struck serifed font for mathematical use"
DESCRIPTION = "DSSerif is a mathematical font package with double struck \
serifed digits, upper and lower case letters, in regular and \
bold weights. The design was inspired by the STIX double struck \
fonts, which are sans serif, but starting from a Courier-like \
base."
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-dsserif-2026.226.1.031svn77682-59.2.noarch.rpm"
RPM_HASH = "54a2f972494b9b0af58b8362a0a9130d3ceed9a62a8a2b56348373f28dd0ad25f8598e10092cc220b2124fe97587b352ddf2bfcb0c3a7ef23d655dd6f5c13c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DSSerif-Bold.tfm \
tex-DSSerif.map \
tex-DSSerif.tfm \
tex-DSSerifUni-Bold.tfm \
tex-DSSerifUni.tfm \
tex-dsserif.sty \
tex-udsserif.fd \
texlive-dsserif"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-dsserif-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
