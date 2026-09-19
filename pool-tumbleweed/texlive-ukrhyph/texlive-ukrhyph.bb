SUMMARY = "Hyphenation Patterns for Ukrainian"
DESCRIPTION = "A range of patterns, depending on the encoding of the output \
font (including the standard T2A, so one can use the patterns \
with free fonts)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21081"

RPM_NAME = "texlive-ukrhyph-2026.226.svn21081-60.2.noarch.rpm"
RPM_HASH = "c735e583bef93c69170609451f8dc03b10dadbc6bc7ff3b3eebafca0bc84f48062773ab5ae47ef7eb1981134812f3f8f98a17220d2fe8693dc2fc6875145f1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catlcy.tex \
tex-lcy2koi.tex \
tex-lcy2lcy.tex \
tex-lcy2ot2.tex \
tex-lcy2t2a.tex \
tex-lcy2ucy.tex \
tex-rules-ph.tex \
tex-rules60.tex \
tex-rules90.tex \
tex-ukrenhyp.tex \
tex-ukrhypfa.tex \
tex-ukrhyph.tex \
tex-ukrhypmp.tex \
tex-ukrhypmt.tex \
tex-ukrhypsm.tex \
tex-ukrhypst.tex \
texlive-ukrhyph"

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
