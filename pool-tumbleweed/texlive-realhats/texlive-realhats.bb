SUMMARY = "Put real hats on symbols instead of ^"
DESCRIPTION = "This LaTeX package makes \\hat put real hats on symbols. The \
package depends on amsmath, calc, graphicx, ifthen, lcg, and \
stackengine."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.1svn66924"

RPM_NAME = "texlive-realhats-2026.226.7.1svn66924-60.4.noarch.rpm"
RPM_HASH = "64c8d9d57fd472228693ae6cbb1e93fcbd343c342907b59187b10cd93ba4a9994c5b3fee3e8d1535f68958af5860f6323db5509df37f073d57c24484bee34ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realhats.sty \
texlive-realhats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
