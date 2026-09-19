SUMMARY = "Babel support for Turkmen"
DESCRIPTION = "The package provides support for Turkmen in babel, but \
integration with babel is not available."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-turkmen-2026.226.0.0.2svn77682-59.2.noarch.rpm"
RPM_HASH = "3a24c7870b9cbc6ec54a71616a5a386746f9ee59177d7ee9f981871d06bde366b0af40348eb283fc897e05512e8c35e0fab85cdd2b7c07b7d87112753871441b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turkmen.ldf \
texlive-turkmen"

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
