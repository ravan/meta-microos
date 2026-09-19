SUMMARY = "Package for typesetting pseudocode"
DESCRIPTION = "This package allows typesetting pseudocode in LaTeX. It is \
based on algpseudocode from the algorithmicx package and uses \
the same syntax, but adds several new features and \
improvements. Notable features include customizable indent \
guide lines and the ability to draw boxes around parts of the \
code for highlighting differences. This package also has better \
support for long code lines spanning several lines and improved \
comments."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn74973"

RPM_NAME = "texlive-algpseudocodex-2026.226.1.2.0svn74973-61.2.noarch.rpm"
RPM_HASH = "dda3522b6cd2fed4ce049442e862f2adb44ef2ce59465820ceb0ad5c7e9d981a2b990b6dc3a72e05d4e3023414e5cebf2c566ba62a7226f4f4c1407ce9d6f72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algpseudocodex.sty \
texlive-algpseudocodex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-etoolbox.sty \
tex-fifo-stack.sty \
tex-kvoptions.sty \
tex-tabto.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
