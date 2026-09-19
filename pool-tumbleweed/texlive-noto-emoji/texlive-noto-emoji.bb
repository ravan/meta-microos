SUMMARY = "Noto Emoji fonts"
DESCRIPTION = "Noto Color Emoji supports all emoji defined in the latest \
Unicode version."
LICENSE = "OFL-1.1"

PV = "2026.226.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-2026.226.2.034svn62950-61.2.noarch.rpm"
RPM_HASH = "596d61e0a81bccfd94682392d482e4cdec35c5d6e9137e41b60889b931833a3c8d51aa2d634e10de5bb8b0cdb314cc9426d9276cef360e9ea65c04aa07694d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji"

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
texlive-noto-emoji-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
