SUMMARY = "A BibLaTeX style for citations in musuos.cls"
DESCRIPTION = "The style is designed for use with the musuos class, but it \
should be usable with other classes, too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-2026.226.1.0svn24097-61.2.noarch.rpm"
RPM_HASH = "d72d20d1260676c4ce1bb197e5cbcf68d5336e4a419cc404f0d166eebe28d7f8e060964185d26b608964cac06088d472d67ef37dcfe45299164018489d05e7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-musuos.lbx \
tex-musuos.bbx \
tex-musuos.cbx \
texlive-biblatex-musuos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-verbose-ibid.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
