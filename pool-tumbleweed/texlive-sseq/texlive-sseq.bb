SUMMARY = "Typesetting spectral sequence charts"
DESCRIPTION = "The package provides commands to draw spectral sequence \
diagrams, providing facilities for clipping and arranging \
multiple symbols so that they do not overlap. The package is \
built using pgf, and shares that systems large demands for TeX \
system memory. Its geometric commands are based on a turtle \
graphics model, and control structures such as loops and \
conditionals are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn31585"

RPM_NAME = "texlive-sseq-2026.226.2.01svn31585-64.2.noarch.rpm"
RPM_HASH = "f8df2da6d80fd01b2bf9ff9ee39e01a52c0af3bb48c8be370635faec1840f5bbf22101846ecfb9f0c41b6808f57635b95b615ff0bb1cdcc45044e8064857d421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sseq.sty \
texlive-sseq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
