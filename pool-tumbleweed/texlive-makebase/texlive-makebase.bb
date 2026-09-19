SUMMARY = "Typeset counters in a different base"
DESCRIPTION = "This package typesets a LaTeX counter such as page in an \
arbitrary base (default 16). It does not change font or \
typeface. The package extends the functionality of the existing \
hex LaTeX 2.09 package and provides documentation. However, the \
author is not a mathematician, and suggestions for rewriting \
the code are welcomed. Warning: this is alpha software and may \
contain bugs. Please report problems to the author."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn41012"

RPM_NAME = "texlive-makebase-2026.226.0.0.2svn41012-59.2.noarch.rpm"
RPM_HASH = "bc83374efc4600c43a708a172006588296e0f59cc510d94a80cd60e4e21be37368c1581dca1f001c3a39cd43145d1cbb91da93a0cca6c95c0cbc2bdeb69758c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebase.sty \
texlive-makebase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
