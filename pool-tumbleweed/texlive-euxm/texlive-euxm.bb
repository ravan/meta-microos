SUMMARY = "Extended Euler by DEK"
DESCRIPTION = "Includes two additional characters needed for Concrete Math \
(ca. 1991)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-euxm-2026.226.svn54074-59.2.noarch.rpm"
RPM_HASH = "7005d8bb4686e9c1070c749c7b680fe7b0ad692d9d04b668da37cc59d251a1bc6b483e18e8394288ee51e6c7ce9219d3080722c1aaf2a4a6e930edb630465d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euxm10.tfm \
tex-euxm5.tfm \
tex-euxm7.tfm \
texlive-euxm"

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
