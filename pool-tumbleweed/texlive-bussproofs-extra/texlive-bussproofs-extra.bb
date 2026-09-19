SUMMARY = "Extra commands for bussproofs.sty"
DESCRIPTION = "This package provides additional functionality for \
bussproofs.sty; specifically, it allows for typesetting of \
entire (sub)deductions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-2026.226.0.0.4svn51299-59.2.noarch.rpm"
RPM_HASH = "aeb3dcd3b28389b35e03d1856e7ac5324b98f80b05b67446d689f4f701de8e20acee05a4fc80533ec9f926c985c9d4c9247be759829424eba39458d5776c8d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bussproofs-extra.sty \
texlive-bussproofs-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bussproofs.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
