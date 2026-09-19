SUMMARY = "Babel support for Spanish"
DESCRIPTION = "This bundle provides the means to typeset Spanish text, with \
the support provided by the LaTeX standard package babel. Note \
that separate support is provided for those who wish to typeset \
Spanish as written in Mexico."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0qsvn77682"

RPM_NAME = "texlive-babel-spanish-2026.226.5.0qsvn77682-60.2.noarch.rpm"
RPM_HASH = "630e69480ea2b7bb866ad8a28ca086ad57a752ecbebd50623927fe0bfda645a489ac903bad0b055877a11caa10379ea75281c446282ec3d98dffe6a151dd8e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanidx.sty \
tex-spanish.ldf \
texlive-babel-spanish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
