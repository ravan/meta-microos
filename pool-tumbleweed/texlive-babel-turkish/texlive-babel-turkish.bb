SUMMARY = "Babel support for Turkish documents"
DESCRIPTION = "The package provides support, within babel, of the Turkish \
language."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-2026.226.1.4svn51560-60.2.noarch.rpm"
RPM_HASH = "d08c3bfa566609c64d0b63e97c9228ef6912415a0f0a202ec78c9db9dc5bf248407bc53f32597ad19fd20d702000f93d7ce61b02b47335fa41bd196b6fc394ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turkish.ldf \
texlive-babel-turkish"

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
