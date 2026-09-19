SUMMARY = "Indices locorum citatorum"
DESCRIPTION = "The package is designed to produce from BibTeX or BibLaTeX \
bibliographical databases the different indices of authors and \
works cited which are called indices locorum citatorum. It \
relies on a specific \\icite command and can operate with either \
BibTeX or BibLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3asvn67201"

RPM_NAME = "texlive-icite-2026.226.1.3asvn67201-60.2.noarch.rpm"
RPM_HASH = "adcdb50bf156de858cdf091390736363934c4709476f76aadd0cfc30ad2f297629133436ba32c7da78830df4e03d23cb197c58cc2d2eb90e389ae560d30a9cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icite.sty \
texlive-icite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-usebib.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
