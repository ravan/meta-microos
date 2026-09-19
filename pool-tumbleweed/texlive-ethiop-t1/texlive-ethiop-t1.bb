SUMMARY = "Type 1 versions of Amharic fonts"
DESCRIPTION = "These fonts are drop-in Adobe type 1 replacements for the fonts \
of the ethiop package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ethiop-t1-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "ddc9efc23ae488860fdff2007596e166e09d8a895aa9180812590e1c161e559f7c4f055d9c4dc0a273bea58775d6a8fdf7a79d18c681a9c2b4af7757d47bf686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ethiop.map \
texlive-ethiop-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-ethiop-t1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
