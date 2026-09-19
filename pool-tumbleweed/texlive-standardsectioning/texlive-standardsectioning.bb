SUMMARY = "Define sectioning commands identical to the standard classes"
DESCRIPTION = "The package implements the sectioning commands fully compatible \
with the standard classes. This is intended, e.g., to make the \
KOMA-Script classes work with packages like titlesec, which \
depend on the implementation of these commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn76431"

RPM_NAME = "texlive-standardsectioning-2026.226.0.0.10svn76431-64.2.noarch.rpm"
RPM_HASH = "812ae93764918cb528256bdf90ff9e50f1edafdb4a5107a809d71ff91221dd78fe26eae4b51e0c307f17abe17ce2bb8badec3cde224bb42b92c4b1cb07a63206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-standardsectioning.sty \
texlive-standardsectioning"

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
