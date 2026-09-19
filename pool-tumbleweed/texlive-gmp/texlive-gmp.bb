SUMMARY = "Enable integration between MetaPost pictures and LaTeX"
DESCRIPTION = "The package allows integration between MetaPost pictures and \
LaTeX. The main feature is that passing parameters to the \
MetaPost pictures is possible and the picture code can be put \
inside arguments to commands, including \\newcommand."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gmp-2026.226.1.0svn77682-60.4.noarch.rpm"
RPM_HASH = "e45a6ea104615e268b4029502e6b165e44c79b665d21bf71f219274f4ac15ae4ea8e2ab7c1b4ef7a7175afc2029b8f2b827fa1f5b4104a591f075f819562b8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmp.sty \
texlive-gmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
