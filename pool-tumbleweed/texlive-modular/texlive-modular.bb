SUMMARY = "Relative section headings for modular documents"
DESCRIPTION = "LaTeX sections have absolute depth, e.g. \\section, \\subsection, \
etc. When composing modular documents, we want relative depths. \
The coseoul package provides relative headings, but does not \
get things right when composing a document modularly from \
multiple parts. This package provides the missing piece. \
modular relies on coseoul, import, and ifthen."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44142"

RPM_NAME = "texlive-modular-2026.226.svn44142-61.2.noarch.rpm"
RPM_HASH = "7ed4dc633f619ad5f13400a85103474ff10004b84d69909e14e4b1e9723e07cec9d9a868b3ea85918f822462249cdfb9cb90a6cd04f774c95625372e19793b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modular.sty \
texlive-modular"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-coseoul.sty \
tex-ifthen.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
