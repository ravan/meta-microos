SUMMARY = "A method for numbering chemical compounds"
DESCRIPTION = "The package defines a \\label- and \\ref-like commands for \
compound numbers. The package requires LaTeX3 packages expl3 \
(from the l3kernel bundle) as well as xparse and l3keys2e (from \
the l3packages bundle)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-chemnum-2026.226.1.3asvn77682-60.2.noarch.rpm"
RPM_HASH = "1690c72baf4e34a04af3c560f7fd75160b170a2ef637d67cc0251a67da479877f9f7d43f7bdaec32887d287327630d45c306a82cd281b5f1e938dbd9686e7f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemnum.sty \
texlive-chemnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemgreek.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-psfrag.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
