SUMMARY = "Typeset units"
DESCRIPTION = "The package is provided as a bundle with the nicefrac package \
for typing fractions. Units uses nicefrac in typesetting \
physical units in a standard-looking sort of way."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9bsvn42428"

RPM_NAME = "texlive-units-2026.226.0.0.9bsvn42428-60.2.noarch.rpm"
RPM_HASH = "239c2e7536350a9ccc4860f66b73833c84a3020e598d438e1efce7672137fc02d005e1f6dd88e70ccd6f2af7f593c5cf32689ade8f24397d3cacb3c393add17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicefrac.sty \
tex-units.sty \
texlive-units"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
