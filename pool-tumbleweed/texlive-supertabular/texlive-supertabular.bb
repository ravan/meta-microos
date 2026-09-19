SUMMARY = "A multi-page tables package"
DESCRIPTION = "The package was a predecessor of longtable; the newer package \
(designed on quite different principles) is easier to use and \
more flexible, in many cases, but supertabular retains its \
usefulness in a few situations where longtable has problems."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2csvn77682"

RPM_NAME = "texlive-supertabular-2026.226.4.2csvn77682-64.2.noarch.rpm"
RPM_HASH = "e366c85a95c25f6a638432d19c47a48fd83696ca40da203909bcfbee34aabb24b9cf6482ae8ac6a2e951ef31b80646da131c6875e6c20a80d3bee83bc0060d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-supertabular.sty \
texlive-supertabular"

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
