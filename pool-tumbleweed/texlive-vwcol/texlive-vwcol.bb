SUMMARY = "Variable-width multiple text columns"
DESCRIPTION = "The package provides a crude environment (vwcol) for \
typesetting multicolumn paragraph text of various column widths \
on a single page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-vwcol-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "5788b740afbab5bbfa79f730ec75ab96558e6c54b13cfbeebec13fcb482c327bf5931f2634ae1a6848bf9630c67aba9a6b2f7b581a06cf15db478bfa93424585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vwcol.sty \
texlive-vwcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-environ.sty \
tex-keyval.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
