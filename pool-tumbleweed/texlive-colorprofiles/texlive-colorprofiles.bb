SUMMARY = "Collection of free ICC profiles"
DESCRIPTION = "This package collects free ICC profiles that can be used by \
color profile aware applications/tools like the pdfx package, \
as well as TeX and LaTeX packages to access them."
LICENSE = "LPPL-1.0"

PV = "2026.226.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-2026.226.20181105svn49086-60.2.noarch.rpm"
RPM_HASH = "5f74f1ad9953d24d82cd7decf90e09e0a9d0ab5f9829797369613201f05920bdf5329ebd47c26210f7b3065528c8ac8b813395896faa2b7e9ffe2a2572c7467f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorprofiles.sty \
tex-colorprofiles.tex \
texlive-colorprofiles"

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
