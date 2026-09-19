SUMMARY = "Use consistent typesetting for quantum chemistry related software"
DESCRIPTION = "This package gives access to several commands related to \
quantum chemistry. This includes consistent formatting of names \
of QC programs, as well as methods such as density functionals. \
Furthermore, units of energy are set, and easy-to-use commands \
are provided. Lastly, the corporate design colors of the \
University of Bonn are defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-quantum-chemistry-bonn-2026.226.0.0.1svn76924-60.4.noarch.rpm"
RPM_HASH = "638c711b76df6aaea6d263ba85d418ca6a7be60fc4e9ccd0f27bd2bf64a55f20940192b93043f50595ff32d76cacb86fa9d9366590d493d467f73d625c9f74d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantum-chemistry-bonn.sty \
texlive-quantum-chemistry-bonn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-siunitx.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
