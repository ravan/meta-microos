SUMMARY = "Extension of the CJK package for Korean typesetting"
DESCRIPTION = "The package supports typesetting UTF-8-encoded modern Korean \
documents with the help of the LaTeX2e CJK package. It provides \
some enhanced features focused on Korean typesetting culture, \
one of them being allowing line-break between Latin and CJK \
characters. The package requires nanumtype1 fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.5svn70300"

RPM_NAME = "texlive-cjk-ko-2026.226.2.5svn70300-60.2.noarch.rpm"
RPM_HASH = "7bd11b43afe6172ef3aa18885a8d7e58c9779dc51777def6616af2d54689217ebb90e3ef34638fca66739683559a32a9cc1b409e55df3e3e9aae062bb910f923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjkutf8-josa.sty \
tex-cjkutf8-ko.sty \
tex-cjkutf8-nanummjhanja.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-kotex.sty \
texlive-cjk-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-CJKutf8.sty \
tex-kotexutf.sty \
tex-luatexko.sty \
tex-ulem.sty \
tex-xetexko.sty \
texlive \
texlive-cjk \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
