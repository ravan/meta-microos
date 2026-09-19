SUMMARY = "Small modules to load various fonts for use in ConTeXt"
DESCRIPTION = "The package provides files offering interfaces to 33 publicly \
available fonts (or collections of fonts from the same \
foundry); each is available in a .mkii and a .mkiv version."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76524"

RPM_NAME = "texlive-context-typescripts-2026.226.svn76524-61.2.noarch.rpm"
RPM_HASH = "99a8430033c5e59da04ef06fb1283fbcab5a353203dbe666825a33b75d6689c1c22bc2b59997fea984d4a1013ded6245d08e37e5f7fa358aed8b2e663f495e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
