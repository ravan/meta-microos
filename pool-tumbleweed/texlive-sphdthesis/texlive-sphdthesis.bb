SUMMARY = "LaTeX template for writing PhD Thesis"
DESCRIPTION = "The package provides a LaTeX document class for writing a PhD \
thesis. The author developed it while writing his PhD thesis in \
School of Computing (SoC), National University of Singapore \
(NUS). By default, the class adheres to the NUS Guidelines on \
Format of Research Thesis Submitted For Examination. However, \
the class for conformation to a different guideline should not \
be difficult."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn34374"

RPM_NAME = "texlive-sphdthesis-2026.226.1.0svn34374-64.2.noarch.rpm"
RPM_HASH = "39ea61ef0990c1cb0da7456e7c09aa1deea04f05f82f5c9c3797949ffa0c8bbe17909a1c72895b3bd1f04306dae7a8370d8de8092789116e2906a2849af042f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SPhdThesis.cls \
texlive-sphdthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-colortbl.sty \
tex-emptypage.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fix-cm.sty \
tex-float.sty \
tex-fncychap.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-microtype.sty \
tex-parskip.sty \
tex-report.cls \
tex-sectsty.sty \
tex-setspace.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-tocloft.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
