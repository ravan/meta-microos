SUMMARY = "XeLaTeX template for writing Xidian University Thesis"
DESCRIPTION = "This is a XeLaTeX template for writing theses to apply academic \
degrees in Xidian University. The template is designed \
according to the official requirements on typesetting theses. \
The template currently supports all levels of degrees from \
bachelor to doctor, including both academic master and \
professional master. But it is not guaranteed that you will \
pass the typesetting check and obtain your degree by using this \
template."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn63116"

RPM_NAME = "texlive-xduthesis-2026.226.1.00svn63116-59.4.noarch.rpm"
RPM_HASH = "5f6721196e1b0b1cfbe0d43cea91a976fe619ff71720a2088a883fb68d0a1897bd45685764403d3d650cf8a1f52e6daf1967c57805047edbb6bbe248b8e85a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xduthesis.cfg \
tex-xduthesis.cls \
texlive-xduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-book.cls \
tex-calc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-metalogo.sty \
tex-natbib.sty \
tex-paralist.sty \
tex-subfig.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-xeCJK.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
