SUMMARY = "Provides properties of chemical elements"
DESCRIPTION = "The package provides means for retrieving properties of \
chemical elements like atomic number, element symbol, element \
name, electron distribution or isotope number. Properties are \
defined for the elements up to the atomic number 112. This \
package is a spin-off of the package bohr by the same author."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn61792"

RPM_NAME = "texlive-elements-2026.226.0.0.4svn61792-61.4.noarch.rpm"
RPM_HASH = "832288276b09d9f4494a6fce9dab43ae7e47ed2f48108bb19de08edee3c9582cddaf39897c43baa07e5ec1b5db50ce6aa239c7af1c31a12e2f1d150b2897cc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elements-names-brazil.def \
tex-elements-names-english.def \
tex-elements-names-french.def \
tex-elements-names-german.def \
tex-elements-names-portuges.def \
tex-elements-names-spanish.def \
tex-elements.sty \
texlive-elements"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
