SUMMARY = "Shade pieces of text"
DESCRIPTION = "The package provides a shaded backdrop to a box of text. It \
uses a Metafont font (provided) which generates to appropriate \
shading dependent on the resolution used in the Metafont \
printer parameters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn22212"

RPM_NAME = "texlive-shade-2026.226.1svn22212-60.2.noarch.rpm"
RPM_HASH = "d70f94d5c05f26f2e6dfcc7a3bb7bfe914c4151f2223a31f17015aa20e86d7d4f97c8ed5a614f9db25590b9b9ca75368ddb3eb961df3f276086df7e0dce7a6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shade.tex \
texlive-shade"

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
