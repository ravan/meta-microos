SUMMARY = "Extensions for package pict2e"
DESCRIPTION = "The package extends the drawing capacities of the pict2e that \
serves as a LaTeX2e replacement for picture mode. In \
particular, curve2e introduces new macros for lines and \
vectors, new specifications for line terminations and joins, \
arcs with any angular aperture, arcs with arrows at one or both \
ends, generic curves specified with their nodes and the tangent \
direction at these nodes."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.0svn77682"

RPM_NAME = "texlive-curve2e-2026.226.2.6.0svn77682-61.2.noarch.rpm"
RPM_HASH = "382a9267968e7a53bff24e9588ae295673dfdaa10fb91c9511fb81de6e91dc0b3538c6396d77d30285ae5cc7cf300f508b491f9dde69b49e07c3521141681e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curve2e-v161.sty \
tex-curve2e.sty \
texlive-curve2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-pict2e.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
