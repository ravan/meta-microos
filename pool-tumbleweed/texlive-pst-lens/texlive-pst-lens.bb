SUMMARY = "Lenses with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstLens that will draw a lens. Command parameters provide a \
remarkable range of effects."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn15878"

RPM_NAME = "texlive-pst-lens-2026.226.1.02svn15878-59.2.noarch.rpm"
RPM_HASH = "757a05219d6f228001c2e30a40c97fe31966e61a7eed2ffa4656d053b487b63f52ed4fbf49c95cf826efd9314efbc7d3f8c62d9da3397519986cdf015a3e191b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-lens.sty \
tex-pst-lens.tex \
texlive-pst-lens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
