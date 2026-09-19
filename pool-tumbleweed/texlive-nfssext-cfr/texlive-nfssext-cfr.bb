SUMMARY = "Extensions to the LaTeX NFSS"
DESCRIPTION = "The package is a development of nfssext.sty, distributed with \
the examples for the font installation guide. The package has \
been developed for use in packages such as cfr-lm and \
venturisadf,"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-nfssext-cfr-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "26c65e25d6b155b4b7e9aba767dd1992475efef28647669243f5c5e14c84fca450fe54043cff3c7e30d65717fafd239fb8bed90ce952ce5d2606814c0525d007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nfssext-cfr-nfss.sty \
tex-nfssext-cfr-nnfss.sty \
tex-nfssext-cfr.sty \
texlive-nfssext-cfr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-svn-prov.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
