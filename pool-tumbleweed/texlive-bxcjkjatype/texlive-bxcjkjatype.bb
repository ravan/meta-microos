SUMMARY = "Typeset Japanese with pdfLaTeX and CJK"
DESCRIPTION = "The package provides a working configuration of the CJK \
package, suitable for Japanese typesetting of moderate quality. \
Moreover, it facilitates use of the CJK package for pLaTeX \
users, by providing commands that are similar to those used by \
the pLaTeX kernel and some other packages used with it."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn67705"

RPM_NAME = "texlive-bxcjkjatype-2026.226.0.0.5svn67705-59.2.noarch.rpm"
RPM_HASH = "07ae39c16ddef2e25140d9b4cc264f6e701f935ff62335caa8513d10c83559cb7549901b8a307292870162cdb8fc25a89e892e240a3c8725625e540fe7f82faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxcjkjatype.sty \
texlive-bxcjkjatype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJK.sty \
tex-CJKpunct.sty \
tex-CJKspace.sty \
tex-CJKutf8.sty \
tex-atbegshi.sty \
tex-etoolbox.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
