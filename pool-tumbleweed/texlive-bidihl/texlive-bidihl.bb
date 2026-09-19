SUMMARY = "Experimental bidi-aware text highlighting"
DESCRIPTION = "Experimental bidi-aware text highlighting."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-bidihl-2026.226.0.0.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "b32344663a1bf209710c8d456bfd80c7d86caa9d3ff3083be1118986426802bbf00efeca38e1186f7a366596b8c39eaa083f7f565c11136a92a0c85c073ccef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidihl.sty \
texlive-bidihl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
