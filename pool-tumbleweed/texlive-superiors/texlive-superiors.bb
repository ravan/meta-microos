SUMMARY = "Attach superior figures to a font family"
DESCRIPTION = "The package allows the attachment of an arbitrary superior \
figures font to a font family that lacks one. (Superior figures \
are commonly used as footnote markers.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-superiors-2026.226.2.0svn77682-64.2.noarch.rpm"
RPM_HASH = "34da1151cc78b9daaa5680e96390909c97cbfd0af17ddc6c8bb317871bd33bc44d568e233518271cc5fa8a44e8f82ef73ebfcd164359aa23bb340a4b348fd8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-superiors.sty \
texlive-superiors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-trace.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
