SUMMARY = "Synchronize output paper size with layout paper size"
DESCRIPTION = "As is well known, in LaTeX processing layout paper size \
specified by document class options is not automatically \
applied to output paper size. This package enables LaTeX \
authors to synchronize both kinds of paper sizes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-2026.226.0.0.6svn63174-59.2.noarch.rpm"
RPM_HASH = "cb44c43b9c998d07b6a17397e1323b044a23c8e188829c02f95463ae81870d3fd746eb35e66f934ddcf1cc562cdabedaceca298a78b888f5aca3505b72c2c6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxpapersize.sty \
texlive-bxpapersize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifptex.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-pxatbegshi.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
