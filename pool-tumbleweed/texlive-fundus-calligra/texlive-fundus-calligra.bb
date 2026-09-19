SUMMARY = "Support for the calligra font in LaTeX documents"
DESCRIPTION = "The package offers support for the calligra handwriting font, \
in LaTeX documents. The package is part of the fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-fundus-calligra-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "0cabf3487088818890770950c2b00c2abe88008859f24242b0ac744b337939952c53d868a9c3e58ace54ff61623e01712be864bcea6e057c8238d17058cd0c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calligra.sty \
texlive-fundus-calligra"

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
