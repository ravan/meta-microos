SUMMARY = "First aid for external LaTeX files and packages that need updating"
DESCRIPTION = "This package contains some first aid for LaTeX packages or \
classes that require updates because of internal changes to the \
LaTeX kernel that are not yet reflected in the package's or \
class's code. The file latex2e-first-aid-for-external-files.ltx \
provided by this package is meant to be loaded during format \
generation and not by the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.20251101asvn76740"

RPM_NAME = "texlive-firstaid-2026.226.20251101asvn76740-59.2.noarch.rpm"
RPM_HASH = "3d0e832fe72fad0cafd1a21c644b1a5cf67c0fc5d809a729796a8f8ce823bf66093ae4a9dc1005746371744bdc818b44e840955b2562f90f403d042d07f75c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filehook-ltx.sty \
tex-underscore-ltx.sty \
texlive-firstaid"

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
