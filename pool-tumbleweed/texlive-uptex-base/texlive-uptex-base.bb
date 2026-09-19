SUMMARY = "Plain TeX formats and documents for upTeX"
DESCRIPTION = "The bundle contains plain TeX format files and documents for \
upTeX and e-upTeX."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77840"

RPM_NAME = "texlive-uptex-base-2026.226.svn77840-60.2.noarch.rpm"
RPM_HASH = "cf9dc693d4a52b206b1a74c0fd9877e52818ae8aa570a32d8fcfb5eab21fd8b39ef231271faf12c4e339d51c279dce28a7296a569d9eb3856404c0844ead02e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukinsoku.tex \
tex-uptex.tex \
texlive-uptex-base"

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
