SUMMARY = "Customized theorem environments for computer science documents"
DESCRIPTION = "This package provides customized theorem-like environments \
specifically designed for computer science documents. It offers \
a set of pre-defined theorem styles and environments to \
streamline the creation of theorems, definitions, remarks, and \
other common structures in computer science papers and \
documents. Features: Predefined theorem styles tailored for \
computer science Environments for theorems, lemmas, \
definitions, examples, remarks, and more Special environments \
for cases and axioms Customizable accent color Optional \
cleveref support for enhanced cross-referencing The package \
requires the following packages to be installed: amsmath, \
amssymb, amsthm, enumitem, and thmtools. If using the cleveref \
option, hyperref and cleveref are also required."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73506"

RPM_NAME = "texlive-csthm-2026.226.1.3svn73506-61.2.noarch.rpm"
RPM_HASH = "ed0c9668e11a70d47660f8787176ca8daf88dbdb8fb0a66f86449ff6f167d847e2403e85ee884872639d20dbddabcf938cd984bb53d4d5d33b6a2722df58d5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csthm.sty \
texlive-csthm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-cleveref.sty \
tex-enumitem.sty \
tex-thmtools.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
