SUMMARY = "Manage references to experimental data"
DESCRIPTION = "The package provides a mechanism that maintains a fixed \
symbolic reference to numerical results; such results may vary \
as the project proceeds (and hence the project report \
develops)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn62942"

RPM_NAME = "texlive-dataref-2026.226.0.0.7svn62942-61.2.noarch.rpm"
RPM_HASH = "2dcdfaa6b98f16d15935464077b3b69b89b65dba12fda03b7acabba53951f05291df816cad10b09dddf8906f9ffbc8ac8246fc5ce4663020c2a7a2f249f48f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dataref.sty \
texlive-dataref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-iftex.sty \
tex-import.sty \
tex-kvoptions.sty \
tex-pdfcomment.sty \
tex-pgf.sty \
tex-xfp.sty \
tex-xtab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
