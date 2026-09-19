SUMMARY = "Define textual variants"
DESCRIPTION = "The package provides commands to formalize textual variants in \
critical editions typeset using eledmac."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn38114"

RPM_NAME = "texlive-eledform-2026.226.1.1asvn38114-61.4.noarch.rpm"
RPM_HASH = "a848f6b70055c6526950c0b293405d73af5b6e69ec25a743a0f674aedf39d716ea61b61534fbace989bb901b487fb0748ae0c7ca80c0caf389017838b8ac6ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledform.sty \
texlive-eledform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eledmac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
