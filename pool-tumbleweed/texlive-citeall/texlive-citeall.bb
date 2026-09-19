SUMMARY = "Cite all entries of a bbl created with BibLaTeX"
DESCRIPTION = "This small package allows to cite all entries of a bbl-file \
created with BibLaTeX (v1.9)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-citeall-2026.226.1.4svn77682-60.2.noarch.rpm"
RPM_HASH = "732bc4d6d5dc6a3465f807263261fcada9d488344f2cbeeab94dac3e9547b72b3cfc84c820c099854e1c6eac15dcd670923a5d4ac32519347da65ec01d695000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeall.sty \
texlive-citeall"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
