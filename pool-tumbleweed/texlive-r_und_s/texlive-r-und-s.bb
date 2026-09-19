SUMMARY = "Chemical hazard codes"
DESCRIPTION = "The r_und_s package decodes the german 'R- und S-Satze', which \
are numerically coded security advice for chemical substances \
into plain text. This is, e.g., used to compose security sheets \
or lab protocols and especially useful for students of \
chemistry. There are four packages, giving texts in German, \
English, French and Dutch."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-2026.226.1.3isvn15878-60.4.noarch.rpm"
RPM_HASH = "78822c9f32f871ab45a77065c0e1c9179159e9b97da09ee5b0f4088ebcd1fdf50c672ef04decc9f3ee067307701db260844675587248d8e7109f5121887c5cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eng-rs.sty \
tex-eng-rs.tex \
tex-fr-rs.sty \
tex-fr-rs.tex \
tex-nl-rs.sty \
tex-nl-rs.tex \
tex-r-und-s.sty \
tex-r-und-s.tex \
texlive-r-und-s"

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
