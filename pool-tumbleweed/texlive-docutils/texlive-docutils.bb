SUMMARY = "Helper commands and element definitions for Docutils LaTeX output"
DESCRIPTION = "The package is intended for use with LaTeX documents generated \
from reStructuredText sources with Docutils. When generating \
LaTeX documents, specify this package with the stylesheet \
configuration option, e.g. rst2latex --stylesheet=docutils \
exampledocument.txt"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn56594"

RPM_NAME = "texlive-docutils-2026.226.svn56594-59.2.noarch.rpm"
RPM_HASH = "40a2f8c50c66acc736c1f2d8baab5869def606025b0d227c1661509b1b0f40c378e7adcca3193951d9239b28aa547ef2512b88fe52ca2ede7d8dfd89f9b42654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docutils.sty \
texlive-docutils"

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
