SUMMARY = "Smart typesetting of enumerated cross-references for various TeX formats"
DESCRIPTION = "This package lets TeX manage the formatting of bunches of \
cross-references for you. It features: Automatic collapsing of \
references, Support for references by various criteria, \
including page and note number, line number in ConTeXt and \
edpage and edline when used in conjunction with reledmac, \
Handling of references combining two criteria (e.g. by page and \
note number), Extension mechanisms to add support to other \
types of references without modifying the internal macros. Note \
that sorting is not supported. I assume that users know in what \
order the labels they refer to appear in their document. It is \
written in Plain TeX as much as possible in order to make it \
compatible with a wide array of formats. For the moment, it \
works out of the box with ConTeXt and LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn76004"

RPM_NAME = "texlive-crossrefenum-2026.226.1.2svn76004-61.2.noarch.rpm"
RPM_HASH = "650ab780deb65163596c99872eb637e58f0de8ce9e2c0b4dd7e9b767a684ff6d2677f342e492281836d6a1a05fd18ad1092e4c0eb8b7499ddba48bd8e213ffdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossrefenum.sty \
tex-crossrefenum.tex \
tex-t-crossrefenum.tex \
texlive-crossrefenum"

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
