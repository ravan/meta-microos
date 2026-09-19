SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2026.226.20250811svn76079"

RPM_NAME = "texlive-haranoaji-extra-2026.226.20250811svn76079-60.4.noarch.rpm"
RPM_HASH = "0f43801a88a5cc12befd0fa070a6acb0a279ed68772d56ca4f6587c764b2c2c234391df7a79175009555541d148b8a9d5d5e3ed7f32a14826880cbc1aafea40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-haranoaji-extra-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
