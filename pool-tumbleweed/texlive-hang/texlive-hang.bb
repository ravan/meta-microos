SUMMARY = "Environments for hanging paragraphs and list items"
DESCRIPTION = "This package provides environments for hanging paragraphs and \
list items. In addition, it defines environments for labeled \
paragraphs and list items."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn43280"

RPM_NAME = "texlive-hang-2026.226.2.1svn43280-60.4.noarch.rpm"
RPM_HASH = "1c6e3fc81c38bec2a679e80b1fcc68df0aecfe687bb702f3249f449dfa67580b79267331f484318b27099be85028a65f96f97cdb607a862af7e3b5adaf1565fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hang.sty \
texlive-hang"

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
