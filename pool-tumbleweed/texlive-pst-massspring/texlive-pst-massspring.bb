SUMMARY = "Create animations for two masses connected by a spring"
DESCRIPTION = "This package can create animations (gif or pdf) for two masses \
connected by a spring in a free fall."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77131"

RPM_NAME = "texlive-pst-massspring-2026.226.0.0.01svn77131-59.2.noarch.rpm"
RPM_HASH = "1aeaccbf32878ab3efe8984dbe842d0010b99394c3b3d75c956ef50a5616cbbabe40daa8644686fefb6f422ea73ae93c2f957e98473e2d176571a7071459f7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-massspring.sty \
tex-pst-massspring.tex \
texlive-pst-massspring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
