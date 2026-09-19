SUMMARY = "Insert pagebreak if not enough space"
DESCRIPTION = "Provides commands to disable pagebreaking within a given \
vertical space. If there is not enough space between the \
command and the bottom of the page, a new page will be started."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn77682"

RPM_NAME = "texlive-needspace-2026.226.1.3esvn77682-61.2.noarch.rpm"
RPM_HASH = "92cf74082b9c144813ee68e139798c9ec63903cc0beee2a684a41d54529dcc6060d9dd530d4f53387d79688c78911f4c116d0fd47d013f49ec22c07e6d50e9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-needspace.sty \
texlive-needspace"

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
