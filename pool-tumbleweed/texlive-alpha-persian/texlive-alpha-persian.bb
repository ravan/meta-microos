SUMMARY = "Persian version of alpha.bst"
DESCRIPTION = "The package provides a Persian version of the alpha BibTeX \
style and offers several enhancements. It is compatible with \
the hyperref, url, natbib, and cite packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76790"

RPM_NAME = "texlive-alpha-persian-2026.226.1.3svn76790-61.2.noarch.rpm"
RPM_HASH = "261612438464ddc50c4bfe479202cfd4059c632c06674a65ae14a82e54d4db8ff2312fbe5c3b06f08de0e40e70df7df8516f0955b2a36492c359db075eac6692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alpha-persian"

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
