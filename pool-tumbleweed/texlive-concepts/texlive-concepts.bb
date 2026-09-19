SUMMARY = "Keeping track of formal 'concepts' for a particular field"
DESCRIPTION = "The package helps to keep track of formal 'concepts' for a \
specific field or document. This is particularly useful for \
scientific papers (for example, in physics, mathematics or \
computer science), which may introduce several concepts (with \
their own symbols). The package's commands allow the user to \
define a concept (typically, near its first use), and will \
ensure consistent use throughout the document. The package \
depends on several other packages; while these are fairly \
common packages, the user should check the package's README \
file for the complete list."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-2026.226.0.0.0.5_r1svn29020-60.2.noarch.rpm"
RPM_HASH = "f978fd0da95587cd8dd8619c2c92768d3ab962a2311298e1d4ebff4436a20358d1d476e4ae930b253603bd800f32a3dff57cb81890a2b8f746cb283df3226e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concepts.sty \
texlive-concepts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-ltxkeys.sty \
tex-nth.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
