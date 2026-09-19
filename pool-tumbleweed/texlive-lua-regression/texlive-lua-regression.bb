SUMMARY = "Add polynomial regressions to graphs"
DESCRIPTION = "This LuaLaTeX package provides a simple interface for \
performing polynomial regression on data sets. It allows users \
to specify the order of the polynomial regression, the columns \
of the data set to use, and whether to plot the results. The \
package also includes options for confidence intervals and \
error bands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn74969"

RPM_NAME = "texlive-lua-regression-2026.226.1.0.2svn74969-59.2.noarch.rpm"
RPM_HASH = "c261b00af960a8e7d873d23c2daa755e288dd9d4b597ad363c495572fef991d5b2d0980a236ce63170fdea6f141b2715f1e83df27ed5155db1170f912cd5ed41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-regression.sty \
texlive-lua-regression"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-luacode.sty \
tex-pgfkeys.sty \
tex-pgfplots.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
