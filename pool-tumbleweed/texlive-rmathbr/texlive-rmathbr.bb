SUMMARY = "Repeating of math operator at the broken line and the new line in inline equations"
DESCRIPTION = "Repeating of math operators at the broken line and the new line \
in inline equations is used in Cyrillic mathematical typography \
(Russian for example), but unfortunately LaTeX does not provide \
such an option. This package solves the problem by extending \
ideas described in M. I. Grinchuk 'TeX and Russian Traditions \
of Typesetting', TUGboat 17(4) (1996) 385 and supports most of \
LaTeX mathematical packages. See the documentation for details."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-2026.226.1.1.1svn57173-60.4.noarch.rpm"
RPM_HASH = "ca8e56f104c75b9143566e7aecfe9bc40dad338855566010f9e148ea44352df69e13cdc158677f9db63fbe0dca32de0c499b5ccc474776aca79ce95a1d0517f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rmathbr.sty \
texlive-rmathbr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifetex.sty \
tex-ifluatex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
