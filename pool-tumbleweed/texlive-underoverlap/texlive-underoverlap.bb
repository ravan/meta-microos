SUMMARY = "Position decorations over and under expressions"
DESCRIPTION = "The package overcomes TeX's inherent limitations in commands \
that place decorations (such as braces) at arbitrary positions \
over and under expressions, overlapping as necessary."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1_r1svn77682"

RPM_NAME = "texlive-underoverlap-2026.226.0.0.0.1_r1svn77682-60.2.noarch.rpm"
RPM_HASH = "f4e3439d212d8898113c35a0a2d238b1dbf38459f515df32dc69c324d5bbad19d049cb142b07e699dec573c63289dc7cd70bbc9618704321636394eac2a450df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underoverlap.sty \
texlive-underoverlap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
