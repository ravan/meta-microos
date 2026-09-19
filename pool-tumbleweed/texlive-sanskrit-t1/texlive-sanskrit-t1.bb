SUMMARY = "Type 1 version of 'skt' fonts for Sanskrit"
DESCRIPTION = "The sanskrit-t1 font package provides Type 1 version of Charles \
Wikner's skt font series for the Sanskrit language."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-sanskrit-t1-2026.226.svn55475-60.2.noarch.rpm"
RPM_HASH = "cb3a4bdc1a6b151d7263040d5adaa8d08a31533bea594de216caac502e3527269a5e80b3940950ad2be289b44f77e9b117d38cafe68e6d657f8a9e7a0f3759e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skt.map \
texlive-sanskrit-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-sanskrit-t1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
