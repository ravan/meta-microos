SUMMARY = "A loader for etoolbox.sty in non-LaTeX formats"
DESCRIPTION = "This package implements a wrapper which allows the user to load \
the LaTeX-independent part of LaTeX package etoolbox in other \
formats. It was implemented as an auxiliary package of Memoize."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5ksvn68513"

RPM_NAME = "texlive-etoolbox-generic-2026.226.2.5ksvn68513-59.2.noarch.rpm"
RPM_HASH = "a6e824c70f1d753fae915eff1eadc66c834540e4fb84ae6a7a094d6036430e4b209232c0c22a1ad2f64e8f8e9259d98f2e2b5ad4c7649a4305503419e0d66881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etoolbox-generic.tex \
texlive-etoolbox-generic"

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
