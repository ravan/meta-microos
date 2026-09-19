SUMMARY = "Expandable arithmetic operations with integers"
DESCRIPTION = "This package provides expandable arithmetic operations with \
integers, using the e-TeX extension \\numexpr if it is \
available."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-intcalc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "e93579304badf5d11a6c71b255e68fcc9cd65eeda8633e467d626a98e8052c85bb4c39ac93dff43b2091a503eda7686265e0519c98f3d59d12d71fce63541165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intcalc.sty \
texlive-intcalc"

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
