SUMMARY = "Create and manage graphical overlays"
DESCRIPTION = "The package is useful when building an image from assorted \
material, as in the slides of a projected presentation. The \
package requires pstricks, and shares that package's \
restrictions on usage when generating PDF output."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07bsvn77682"

RPM_NAME = "texlive-pst-ovl-2026.226.0.0.07bsvn77682-59.2.noarch.rpm"
RPM_HASH = "a0fde37cc09ec96edc1417cdca21fa047da9032895f29ed42fa925e95b43fbd06097937fffa6edefdc7c20d20902dc1660fbc8af52a5a54351ff737b95e10a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ovl.sty \
tex-pst-ovl.tex \
texlive-pst-ovl"

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
