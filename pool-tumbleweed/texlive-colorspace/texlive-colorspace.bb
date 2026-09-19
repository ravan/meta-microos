SUMMARY = "Provides PDF color spaces"
DESCRIPTION = "The package provides PDF color spaces. Currently, only spot \
colors and overprinting are supported. It requires xcolor, and \
supports pdfTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn50585"

RPM_NAME = "texlive-colorspace-2026.226.1.3svn50585-60.2.noarch.rpm"
RPM_HASH = "5cea1c76f2ea3bc3a8efc5cface41d8f2917a784279121851a54471c4c12ec123e52cbd528ced6d6ae5f5e6880183cc3626700a58e16a0c81f2e9ee39534c7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorspace.sty \
texlive-colorspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
