SUMMARY = "Visual help for TikZ based on images with minimum text"
DESCRIPTION = "Visual help for TikZ based on images with minimum text: an \
image per command or parameter. The document is in French, but \
will be translated into English later."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.65svn54080"

RPM_NAME = "texlive-visualtikz-2026.226.0.0.65svn54080-60.2.noarch.rpm"
RPM_HASH = "76288c7d4a44fc2f1f88b188d72f1c24174fb718d989f9df0dd289805e4513a5daddebf4fe21810c49f0732ae5ab0e6245f262a1f197bca2fd68c9ff2721c996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualtikz"

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
