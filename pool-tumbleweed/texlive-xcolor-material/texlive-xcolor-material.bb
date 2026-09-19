SUMMARY = "Defines the 256 colors from Google Material Color Palette"
DESCRIPTION = "The package is built on top of the great xcolor package. It \
provides a useful definition of the beautiful Google Material \
Color Palette, available at Google Material design, for its use \
in document writing with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-2026.226.0.0.1svn42289-59.4.noarch.rpm"
RPM_HASH = "d6c8c724692bacb9d0bd5e60e38ca39db78b4a7b5e9ddb00f0667f7410d4705255db06a0938fd58c7ede8564ebc3e4a7700895b546b3f28ba623737f468fc539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcolor-material.sty \
texlive-xcolor-material"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
