SUMMARY = "Syntax highlighting of source code in LaTeX documents"
DESCRIPTION = "The package provides an environment for syntax highlighting \
source code in LaTeX documents. The highlighted source code \
output is formatted via powerful Pygments library of the Python \
language."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23670"

RPM_NAME = "texlive-verbments-2026.226.1.2svn23670-60.2.noarch.rpm"
RPM_HASH = "8a49bea5f36bce931b166bf3a2c1082f2ffa7b51589c29a2305e6e1e19af66eecf38bb3c63eada27bb1297d853b13716f3faa1e29fa79129b0cf6b9485353ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbments.sty \
texlive-verbments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyvrb.sty \
tex-framed.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
