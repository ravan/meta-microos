SUMMARY = "Fix various layout issues in math mode"
DESCRIPTION = "This is a LaTeX2e package to fix some odd behaviour in math \
mode such as spacing around fractions and roots, math symbols \
within bold text as well as capital Greek letters. It also adds \
some related macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74752"

RPM_NAME = "texlive-mathfixs-2026.226.1.1.3svn74752-59.2.noarch.rpm"
RPM_HASH = "247ee24586664effdce5327245e598f80c8c4f3f685d54de0fce512a34bbbee9c542acbdb05a61a3668f43dc5950824c853e9fae33471230120adb9a274421b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfixs.sty \
texlive-mathfixs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
