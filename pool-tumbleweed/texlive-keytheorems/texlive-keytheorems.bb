SUMMARY = "An l3keys interface to amsthm"
DESCRIPTION = "An expl3-implementation of a key-value interface to amsthm, \
implementing most of the functionality provided by thmtools. \
Several issues encountered with thmtools are avoided (see the \
README for a list) and a few new features are added."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn78035"

RPM_NAME = "texlive-keytheorems-2026.226.0.0.3.5svn78035-63.2.noarch.rpm"
RPM_HASH = "1410219295146466605934a49505914ed2055592bc62a5f5355e13d046859fcb320dbec5ad880bafc27aa4790356dd307b84997730e906492dcc8e1bda5fbe8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keytheorems.sty \
tex-keythms-IEEEtran-support.tex \
tex-keythms-amsart-support.tex \
tex-keythms-amsbook-support.tex \
tex-keythms-amsproc-support.tex \
tex-keythms-beamer-support.tex \
tex-keythms-jlreq-support.tex \
tex-keythms-ltx-talk-support.tex \
tex-keythms-memoir-support.tex \
texlive-keytheorems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-amsthm.sty \
tex-refcount.sty \
tex-tcolorbox.sty \
tex-thmtools.sty \
tex-translations.sty \
tex-unique.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
