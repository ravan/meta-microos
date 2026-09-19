SUMMARY = "Flexible book notes in Japanese"
DESCRIPTION = "This style file is designed for compiling book notes in \
Japanese as part of the body text. ('Chuushaku' means \
'booknotes' in Japanese.) The 'remember picture' feature \
automatically calculates coordinates, eliminating the need for \
manual adjustment of note positions. The main packages used in \
chuushaku.sty are TikZ, amsmath, framed, and calc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn73263"

RPM_NAME = "texlive-chuushaku-2026.226.1.0.1svn73263-60.2.noarch.rpm"
RPM_HASH = "301157e5fe8b5e5a3c1ce3c83f6056e4aef5fe2040566703d4d6a4d6c5386931e19ee5171ef4935e1250d8e06a1f1f1c6fc8660b26bb8284a3e2843dde9c8d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chuushaku.sty \
texlive-chuushaku"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-framed.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
