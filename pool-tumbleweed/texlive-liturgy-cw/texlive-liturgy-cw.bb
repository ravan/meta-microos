SUMMARY = "Create Common Worship style documents"
DESCRIPTION = "This package greatly simplifies the typesetting of service \
sheets and booklets in the style of the Common Worship \
liturgical resources of the Church of England. The package \
provides commands for a number of liturgical elements, \
including rubrics, responsories and 'required part' indicators."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76053"

RPM_NAME = "texlive-liturgy-cw-2026.226.0.0.3svn76053-61.2.noarch.rpm"
RPM_HASH = "c96c877da46d4739d1bc4fd5bd0063518a3acd080e8a51b0147b435861091616b1cb76e27f91ad6e8d54237c5eb56237163a579d98c52ef8f136b9425ad7cfd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liturgy-cw.sty \
texlive-liturgy-cw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-bibleref.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-geometry.sty \
tex-titlesec.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
