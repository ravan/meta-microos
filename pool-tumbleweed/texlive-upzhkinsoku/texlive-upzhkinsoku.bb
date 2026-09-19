SUMMARY = "Supplementary Chinese kinsoku for Unicode *pTeX"
DESCRIPTION = "This package provides supplementary Chinese kinsoku (line \
breaking rules etc.) settings for Unicode (e-)upTeX (when using \
Unicode as its internal encoding), and ApTeX. Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-2026.226.0.0.5svn47354-60.2.noarch.rpm"
RPM_HASH = "43c8298ea1b99a35ba9291cac958567c966b5be959bba625d4fad6a6601f0c5acf80d52e94460ffebf882d48c25376daf99f59d53464676c9d01d3ee350d510a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upzhkinsoku.sty \
texlive-upzhkinsoku"

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
