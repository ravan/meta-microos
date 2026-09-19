SUMMARY = "Framework for semantic color, structured highlighting, and scholarly communication"
DESCRIPTION = "KTBox is a modular LaTeX framework that introduces semantic \
color palettes, structured highlight boxes, and ORCID-linked \
author utilities for scholarly writing. The package is composed \
of three lightweight and independent style files: ktbox.sty - \
defines highlight boxes (standard, numbered, wide) with \
semantic theming. ktcolor.sty - provides semantic color \
palettes with light and dark modes. ktorcid.sty - adds \
ORCID-linked author commands and icons. The framework separates \
structure from style, ensuring compatibility with major classes \
such as IEEEtran, acmart, article, beamer, and ICLR. Features \
include numbered key-takeaway boxes, wide-format environments \
for emphasis, multi-column layouts, and dual light/dark themes. \
KTBox aims to improve clarity, portability, and reproducibility \
in academic publishing across articles, posters, and \
presentations."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.0.1svn76524"

RPM_NAME = "texlive-ktbox-2026.226.0.0.0.1svn76524-63.2.noarch.rpm"
RPM_HASH = "4f64e19718ca88d50851b6b3e267b47313f4a739902c4faba1657aa04b7d0098b7be9304922247d3e38f8565d4969639638b31e5db5f4f757a76ed3f24c43e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ktbox.sty \
tex-ktcolor.sty \
tex-ktorcid.sty \
texlive-ktbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-hyperref.sty \
tex-orcidlink.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
