SUMMARY = "Decorative rules between columns"
DESCRIPTION = "This package lets you customize the appearance of the vertical \
rule that appears between columns of multicolumn text. It is \
primarily intended to work with the multicol package, hence its \
name, but also supports the twocolumn option and \\twocolumn \
macro provided by the standard classes (and related classes \
such as the KOMA-Script equivalents). The package depends on \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn78101"

RPM_NAME = "texlive-multicolrule-2026.226.1.3asvn78101-61.2.noarch.rpm"
RPM_HASH = "17a8b868c92fe5c28f5d924fc9fd62a26d544554d660dabbccd3ad3b91445dab482e10796f8b28c42321a8aa3826d867cbd041409c1341bc06e0ed579418d736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multicolrule.sty \
texlive-multicolrule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-multicol.sty \
tex-scrlfile.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
