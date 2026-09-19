SUMMARY = "A simple way to create dynamic blocks for Beamer"
DESCRIPTION = "The package provides full customisation of the aspect and \
dimensions of blocks inside a presentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-2026.226.0.0.2bsvn35193-61.4.noarch.rpm"
RPM_HASH = "a5089ba6c51618c0f8345831b79a3cd5f53337b33255d800d145b8bb1e2934c55568ae8f91d9df85c2fc997e0f4924859b9fb413360f901b3af9952c1fa49002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynblocks.sty \
texlive-dynblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
