SUMMARY = "Tools for drawing graphs of functions"
DESCRIPTION = "The tkz-fct package is designed to give math teachers (and \
students) easy access to programming graphs of functions with \
TikZ and gnuplot."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-2026.226.1.7csvn61949-59.2.noarch.rpm"
RPM_HASH = "d2470fc5c844e862482567754db7e5a544ea07e6130cd43393fbd04c3b30bc3d59a503b9e33f0f9d45a92ba120e9a8c9d7e3f656affd61dcc0fa0d700dc22c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-fct.sty \
texlive-tkz-fct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-tkz-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
