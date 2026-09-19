SUMMARY = "Non-floating marginal content with automatic placement for LuaLaTeX"
DESCRIPTION = "This LuaLaTeX package allows the placement of marginal content \
anywhere, without \\marginpar's limits, and automatically \
adjusts positions to prevent overlaps or content being pushed \
off the page, and offers key-value settings that allow \
fine-grained customization."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.83.20svn77235"

RPM_NAME = "texlive-marginalia-2026.226.0.0.83.20svn77235-59.2.noarch.rpm"
RPM_HASH = "ae3c65f2e26e33e7a7bba4db0e00b065f127a0273f2dd66843e0737804d0fe84bd4f14770fe28482acb72911463d5254a85a611caddd8d3056f1e1b8d5b9a465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginalia.sty \
texlive-marginalia"

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
