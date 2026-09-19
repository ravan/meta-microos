SUMMARY = "TeX support (from CJK) for the norasi font"
DESCRIPTION = "The norasi-c90 package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn60831"

RPM_NAME = "texlive-norasi-c90-2026.226.svn60831-61.2.noarch.rpm"
RPM_HASH = "e3f7a5221dd4db1661213e0d0e287e75317af71b49e1d27d6e71f67515b22610f43c55ce095cc3a42eafb97ae51241f2aec06d14199ce1915ef41e8a6eb05f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftnb8z.tfm \
tex-ftnbi8z.tfm \
tex-ftni8z.tfm \
tex-ftnr8z.tfm \
tex-norasi-c90.map \
texlive-norasi-c90"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
