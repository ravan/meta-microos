SUMMARY = "An address book using BibTeX"
DESCRIPTION = "A package for LaTeX and BibTeX that facilitates the \
construction, maintenance and exploitation of an address \
book-like database."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn15878"

RPM_NAME = "texlive-directory-2026.226.1.20svn15878-59.2.noarch.rpm"
RPM_HASH = "6843b2f090be9320ddadbbb568a2edb3ea2454852606e828a9022de9660f33eed8f41ee8d279c647bfc35a63293dcb065727ea7c70ff85e84ffe9853e1dedf25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-directory.sty \
texlive-directory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
