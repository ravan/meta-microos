SUMMARY = "A block letter style for the letter class"
DESCRIPTION = "A style file for use with the letter class that overwrites the \
\\opening and \\closing macros so that letters can be styled with \
the block letter style instead of the default style. Thus, the \
return address, the closing, and the signature appear flushed \
on the left margin."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17209"

RPM_NAME = "texlive-block-2026.226.svn17209-59.2.noarch.rpm"
RPM_HASH = "b6e27e9d3a9d833a5e1cded1aec762d7642955133ca4d1371a293e42c4b3ba1a2373dd01bff2aa3b621ea698389da78357c2d32ada13aee8f9d105fb251c66a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-block.sty \
texlive-block"

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
