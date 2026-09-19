SUMMARY = "Ridgeway's fonts"
DESCRIPTION = "Fonts (as Metafont source) for Old English, Indic languages in \
Roman transliteration and Puget Salish (Lushootseed) and other \
Native American languages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22459"

RPM_NAME = "texlive-wnri-2026.226.svn22459-60.2.noarch.rpm"
RPM_HASH = "8977bcd61bc9166cd60d728152472bd8ec6d027d491482bf306fc77eaeecc72e6c67b11c74c34605d0a5ceb07a7ee363e1b5ad8789e442393587a0ea19ef1521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wnindic.map \
tex-wnrib10.tfm \
tex-wnrib8.tfm \
tex-wnribi10.tfm \
tex-wnrii10.tfm \
tex-wnrii8.tfm \
tex-wnrir10.tfm \
tex-wnrir8.tfm \
tex-wnris10.tfm \
tex-wnris8.tfm \
tex-wnrit10.tfm \
tex-wnrit8.tfm \
texlive-wnri"

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
