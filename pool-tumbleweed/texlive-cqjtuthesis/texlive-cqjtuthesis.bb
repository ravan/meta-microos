SUMMARY = "Thesis template for Chongqing Jiaotong University (CQJTU)"
DESCRIPTION = "This is a LaTeX document class for typesetting theses at \
Chongqing Jiaotong University. It supports Bachelor's thesis, \
Academic Master's thesis, Professional Master's thesis, and \
Doctoral dissertation. The template strictly follows the \
official formatting requirements from the university."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77769"

RPM_NAME = "texlive-cqjtuthesis-2026.226.1.0.2svn77769-61.2.noarch.rpm"
RPM_HASH = "43e8f958a48c149aa8b10d58eaf68640761379fab02442aac34f6b67b17de2633a369eb9b4e6fecb3fc86f4bcc9701be5c8dab2ce13c89e0667c42f41e81fc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cqjtuthesis.cls \
texlive-cqjtuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKnumb.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-indentfirst.sty \
tex-kvoptions.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
