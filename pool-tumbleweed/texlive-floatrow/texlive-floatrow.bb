SUMMARY = "Modifying the layout of floats"
DESCRIPTION = "The floatrow package provides many ways to customize layouts of \
floating environments and has code to cooperate with the \
caption 3.x package. The package offers mechanisms to put \
floats side by side, and to put the caption beside its float. \
The floatrow settings could be expanded to the floats created \
by packages rotating, wrapfig, subfig (in the case of rows of \
subfloats), and longtable."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn77682"

RPM_NAME = "texlive-floatrow-2026.226.0.0.3bsvn77682-60.2.noarch.rpm"
RPM_HASH = "c646b0e3fc364869e77da2b3ce52e777985fd6cec3d21571f35eb7211b203b844941b787aaad8356e12bc487a6f7451c920d77a2a74ba481b4a8d4cb740b7ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-floatpagestyle.sty \
tex-floatrow.sty \
tex-fr-fancy.sty \
tex-fr-longtable.sty \
tex-fr-subfig.sty \
tex-listpen.sty \
texlive-floatrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption3.sty \
tex-fancybox.sty \
tex-keyval.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
