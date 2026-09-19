SUMMARY = "Add picture commands (or backgrounds) to every page"
DESCRIPTION = "The package adds one or more user commands to LaTeX's shipout \
routine, which may be used to place the output at fixed \
positions. The grid option may be used to find the correct \
places."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0dsvn77682"

RPM_NAME = "texlive-eso-pic-2026.226.3.0dsvn77682-59.2.noarch.rpm"
RPM_HASH = "6eb7f3467f5792bf70473861ae261900c0052b6cc204086ea3d8526e7137c9b83e83221a530dbb75a44e8fef02e939920b57ce916960f1d7ef5e804823b78614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eso-pic.sty \
tex-showframe.sty \
texlive-eso-pic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
