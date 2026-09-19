SUMMARY = "Cmexb10 metrics and Type 1"
DESCRIPTION = "Computer Modern Math Extension bold, metrics and .pfb file. \
Made by Petr Olsak via autotracing."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-cmexb-2026.226.svn54074-60.2.noarch.rpm"
RPM_HASH = "b8c8450de190632ba5c73e89c089f446ac21cc90245fdafff5baa43d696ae8f46be77458314343837d585fbc440dda2cf3e1b25655522f6224a01988985e65eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmexb.map \
tex-cmexb10.tfm \
texlive-cmexb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cmexb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
