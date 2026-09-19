SUMMARY = "Draw polygons, reentrant stars, and fractions in circles with MetaPost"
DESCRIPTION = "The shapes set of macros allows drawing regular polygons; their \
corresponding reentrant stars in all their variations; and \
fractionally filled circles (useful for visually demonstrating \
the nature of fractions) in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42428"

RPM_NAME = "texlive-shapes-2026.226.1.1svn42428-60.2.noarch.rpm"
RPM_HASH = "2e4247f2006f1b81cae2a57af507566e4310ca26b2a9a4335db1e8cbeef85aa4928241531731b717e95338da05743e9293ea722cd0c7974dc37a62ef449a4839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapes"

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
