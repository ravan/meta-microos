SUMMARY = "Typeset miller indices"
DESCRIPTION = "Typeset miller indices, e.g., <1-20>, that are used in material \
science with an easy syntax. Minus signs are printed as bar \
above the corresponding number."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn18789"

RPM_NAME = "texlive-miller-2026.226.1.2svn18789-61.2.noarch.rpm"
RPM_HASH = "bcb3f9a9f15cdf90d3917497600d2a4240b9ebd39b278ddfc7633a7dd9da9a805d4ccf5856cd50a74c20a3e40b501bdcaa183376ded0e554fd953360ad341f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-miller.sty \
texlive-miller"

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
