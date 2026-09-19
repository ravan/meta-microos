SUMMARY = "Macros for mathematics that make the code more readable"
DESCRIPTION = "Inspired by the physicspackage on CTAN, the package defines \
some simple macros for mathematical notation which make the \
code more readable and/or allow flexibility in typesetting \
material."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-2026.226.0.0.1svn47109-63.2.noarch.rpm"
RPM_HASH = "242eef84b6fea6623090ffb0e92c8c89bb2bde09bdd3aaa5c0575979ca0f052b66ef3a25460abc958076f974e76dd198cc6cf75209999089f0026b3b1d9bc802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jkmath.sty \
texlive-jkmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-physics.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
