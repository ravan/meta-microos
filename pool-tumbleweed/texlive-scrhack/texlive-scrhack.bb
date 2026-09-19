SUMMARY = "Compatibility package to emulate the former KOMA-Script package scrhack"
DESCRIPTION = "Up to version 3.41, the scrhack package was part of \
KOMA-Script. It was originally intended to improve the \
compatibility of third-party packages with KOMA-Script. \
However, most of the so-called hacks also added additional \
functionality to the corresponding third-party package. On the \
other hand, it was sometimes urgent to react to a change in \
such a third-party package, which was difficult to do from \
within a large collection like KOMA-Script. Therefore, the \
scrhack part of KOMA-Script was split into several independent \
packages. And the scrhack spin-off was made to emulate the \
former KOMA-Script package of the same name."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.42svn76924"

RPM_NAME = "texlive-scrhack-2026.226.3.42svn76924-60.2.noarch.rpm"
RPM_HASH = "7935f3353944f4e440b868e2dc009094add786804f23f8f89abaa109fe687acc98acaf83ef783bfeb7a8d10fd0cec5d2cc5f53e34559e47215bda4074fb11edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrhack-2023-07-07.sty \
tex-scrhack.sty \
texlive-scrhack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-floatbytocbasic.sty \
tex-floatrowbytocbasic.sty \
tex-lscapeenhanced.sty \
tex-scrkbase.sty \
tex-standardsectioning.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
