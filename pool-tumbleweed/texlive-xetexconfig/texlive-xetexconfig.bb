SUMMARY = "Crop.cfg for XeLaTeX"
DESCRIPTION = "The xetexconfig package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45845"

RPM_NAME = "texlive-xetexconfig-2026.226.svn45845-59.4.noarch.rpm"
RPM_HASH = "704668dc3e53a14765fa075a3952faa7e2b2501fa8e00c876175bb12731f82ab47c4f917ba152e1798eae33aee8a6fc2f03aeb4dfa7f7f891f6407768679119b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crop.cfg \
texlive-xetexconfig"

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
