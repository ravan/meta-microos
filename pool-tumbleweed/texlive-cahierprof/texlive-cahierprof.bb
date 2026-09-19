SUMMARY = "Schedule and grade books for French teachers"
DESCRIPTION = "This package provide tools to help teachers in France to \
produce weekly schedules and grade books."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76102"

RPM_NAME = "texlive-cahierprof-2026.226.1.3svn76102-59.2.noarch.rpm"
RPM_HASH = "2dc3fbc369617a6d97a5f4fc2d5b5a45c0a805ae6a1524ca86d10887a5efdb9221b8b3f5e2f3ef878a9234e7a92fb432ed075441eebcf60590b9e9ebfe1581d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cahierprof.sty \
texlive-cahierprof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-microtype.sty \
tex-nicematrix.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
