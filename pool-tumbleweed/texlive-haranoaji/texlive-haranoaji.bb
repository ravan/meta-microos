SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2026.226.20250811svn76078"

RPM_NAME = "texlive-haranoaji-2026.226.20250811svn76078-60.4.noarch.rpm"
RPM_HASH = "11ed1bc92e1265735b3ada44829a8a44b11ea983821f643c2338541e3f67ac160e36a47db9aec1590ed44c8f130fb028f1acd1ed713b4a0d172459356ef6119c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-filesystem \
texlive-haranoaji-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
