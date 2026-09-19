SUMMARY = "Documentation for Mendex index processor"
DESCRIPTION = "This package provides documentation for Mendex (Japanese index \
processor). The source code of the program is not included, it \
can be obtained from TeX Live subversion repository."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77843"

RPM_NAME = "texlive-mendex-doc-2026.226.svn77843-59.2.noarch.rpm"
RPM_HASH = "cebb65e355107cde7b9728aeb37e0dae85566899b32fb4a5a2c578cfff978ac7f3e3bb100d3ce7dc1ac62ce1eff9f0ad41bcefd92ef847cdcd38db4dd00dbeb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mendex-doc"

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
