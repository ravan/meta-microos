SUMMARY = "Sans-serif mathematics"
DESCRIPTION = "sfmath is a simple package for sans serif maths in documents. \
After including the package, all maths of the current document \
is displayed with sans serif fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn77682"

RPM_NAME = "texlive-sfmath-2026.226.0.0.8svn77682-60.2.noarch.rpm"
RPM_HASH = "f3aafc07b0b23f8000badb17dad1a1d170f5a589efe03f37682efa2ae6aa292da9fc42c0aef18f3aaace636eac2f8d3a260f96e75f60cd684c5aecb9fdc0c405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sfmath.sty \
texlive-sfmath"

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
