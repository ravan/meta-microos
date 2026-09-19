SUMMARY = "Numerically evaluate mathematical expressions in LaTeX form"
DESCRIPTION = "This package defines a command to wrap around a mathematical \
expression in its LaTeX form and, once values are assigned to \
variables, numerically evaluate it. The intent is to avoid the \
need to modify the LaTeX form of the expression being \
evaluated. For programs with a preview facility like LyX, or \
compile-as-you-go systems, interactive back-of-envelope \
calculations and numerical exploration are possible within the \
document being worked on. The package requires the bundles \
l3kernel and l3packages, and the amsmath and mathtools \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn77682"

RPM_NAME = "texlive-numerica-2026.226.3.0.0svn77682-61.2.noarch.rpm"
RPM_HASH = "5691cd6a099cc60e99c16c02983573ebdbfe6487a8667536fd0c16c7f1a6d497306e74baeb0800bd0958d8f8de06d292adc3c0827bc9512d6c7d0b3b57e9a788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica.sty \
texlive-numerica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-mathtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
