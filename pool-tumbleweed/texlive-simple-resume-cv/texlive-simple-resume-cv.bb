SUMMARY = "Template for a simple resume or curriculum vitae (CV), in XeLaTeX"
DESCRIPTION = "Template for a simple resume or curriculum vitae (CV), in \
XeLaTeX. Simple template that can be further customized or \
extended, with numerous examples."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn43057"

RPM_NAME = "texlive-simple-resume-cv-2026.226.svn43057-60.2.noarch.rpm"
RPM_HASH = "3ce42cc15b747e3a190773de3d7e5512a0877fdd9817b8ffe356a0875b4488f44b87ea6032beb38d70774e97219d579f08e2d33224c81e2a22b67b5fdce0aafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleresumecv.cls \
texlive-simple-resume-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-datetime2.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
