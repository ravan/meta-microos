SUMMARY = "Babel contributed support for Catalan"
DESCRIPTION = "The package establishes Catalan conventions in a document (or a \
subset of the conventions, if Catalan is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-2026.226.2.2psvn30259-60.2.noarch.rpm"
RPM_HASH = "108ae3050faa14dbb23e0653421c2de1fb47ebcfab06b60d3d370be109c6f9e7ab69e6e8222f23785debc82ee13b39b2ec5156e058ab36cee833f3e1723b1bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catalan.ldf \
texlive-babel-catalan"

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
