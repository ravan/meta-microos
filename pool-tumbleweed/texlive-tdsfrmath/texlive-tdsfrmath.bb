SUMMARY = "Macros for French teachers of mathematics"
DESCRIPTION = "A collection of macros for French maths teachers in colleges \
and lycees (and perhaps elsewhere). It is hoped that the \
package will facilitate the everyday use of LaTeX by \
mathematics teachers."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-2026.227.1.3svn15878-62.2.noarch.rpm"
RPM_HASH = "61d42b2d0c4682b0f9e60a3caf617f03493560e4d07bef5eeb7d7dc47af4a6bb7ad4f6aeab81388001c85416a348d416420731f270a797e233012ae1b30ea44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tdsfrmath.sty \
texlive-tdsfrmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-ifthen.sty \
tex-stmaryrd.sty \
tex-suffix.sty \
tex-xargs.sty \
tex-xkeyval.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
