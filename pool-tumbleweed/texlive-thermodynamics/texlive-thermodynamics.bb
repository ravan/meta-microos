SUMMARY = "Macros for multicomponent thermodynamics documents"
DESCRIPTION = "This package makes typesetting quantities found in \
thermodynamics texts relatively simple. The commands are \
flexible and intended to be relatively intuitive. It handles \
several sets of notation for total, specific, and molar \
quantities; allows changes between symbols (e.g., A vs. F for \
Helmholtz free energy); and greatly simplifies the typesetting \
of symbols and partial derivatives commonly encountered in \
mixture thermodynamics. Changes of one's notes from one \
textbook to another can be achieved relatively easily by \
changing package options. The package offers a collection of \
macros and environments which are intended to make typesetting \
thermodynamics documents faster, more convenient, and more \
reliable. Macros include symbols for extensive, molar, \
specific, and partial molar properties; excess and residual \
(departure) properties; partial derivatives; heat capacities, \
compressibilities, and expansivities; saturation, mixture, and \
pure-component properties; Henry's Law parameters and activity \
coefficients; changes on mixing, fusion, reaction, sublimation, \
and vaporization; and sets of all moles/mole \
fractions/masses/etc. being held constant in derivatives. \
Conversion of notes between textbooks is trivial for textbooks \
supported by the package, and more general changes in notation \
are also possible through package options."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.03svn77280"

RPM_NAME = "texlive-thermodynamics-2026.227.2.03svn77280-62.2.noarch.rpm"
RPM_HASH = "455a58f28a9e849dff57e6e79dfff127b96de48aa8855c464f111a04ca6e829f6c96a95ba1a7f9a61c7a2c5b27cffb17837985559ea2372c5d3f881e9e053f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thermodynamics.sty \
texlive-thermodynamics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
