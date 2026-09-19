SUMMARY = "AMS document classes for LaTeX"
DESCRIPTION = "This bundle contains three AMS classes, amsart (for writing \
articles for the AMS), amsbook (for books) and amsproc (for \
proceedings), together with some supporting material. This \
material forms one branch of what was originally the AMS-LaTeX \
distribution. The other branch, amsmath, is now maintained and \
distributed separately. The user documentation can be found in \
the package amscls-doc."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.20.6svn77682"

RPM_NAME = "texlive-amscls-2026.226.2.20.6svn77682-61.2.noarch.rpm"
RPM_HASH = "df2159128ddb0da3cb76262f01fd7bf2fedc13fbce997f77a921c4609cb981da1e828baffaa6793860e0ec74460c124ff910985c2ec4a6277debf8f98bc048f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsart.cls \
tex-amsbook.cls \
tex-amsbooka.sty \
tex-amsdtx.cls \
tex-amsldoc.cls \
tex-amsmidx.sty \
tex-amsproc.cls \
tex-amsthm.sty \
tex-upref.sty \
texlive-amscls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-book.cls \
tex-doc.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
