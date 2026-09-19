SUMMARY = "Make eqnarray behave like align"
DESCRIPTION = "The package makes eqnarray environment behave like align from \
amsmath'. It is intended for quick-fixing documents that use \
eqnarray. In cases where it fails, manual conversion to align \
is required, but these cases should be seldom."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-2026.226.1.0asvn43278-61.4.noarch.rpm"
RPM_HASH = "e17d0e3ff39e49cda7af4bf021b818927677c8b8e5de8efec1662f97e08b2f770c1e9bed7efdb82165748d796e6e680b2a2f7ffc98e0d926c2382a24afc3142e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnalign.sty \
texlive-eqnalign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
