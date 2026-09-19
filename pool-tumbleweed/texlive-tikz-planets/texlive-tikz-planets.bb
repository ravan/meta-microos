SUMMARY = "Illustrate celestial mechanics and the solar system"
DESCRIPTION = "This TikZ-package makes it easy to illustrate celestial \
mechanics and the solar system. You can use it to draw sketches \
of the eclipses, the phases of the Moon, etc. The package \
requires the standard packages TikZ, xcolor, xstring, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.4svn75210"

RPM_NAME = "texlive-tikz-planets-2026.226.1.0.4svn75210-59.2.noarch.rpm"
RPM_HASH = "c9219f5bbce3bd4b3d52bdcbbdf2919429528a0c94495dc3b2e97b27013aeb7832ece468c11ac8a17bf7ed4e411569838b530283d1f16bb70e23005720e698ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-planets.sty \
texlive-tikz-planets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
