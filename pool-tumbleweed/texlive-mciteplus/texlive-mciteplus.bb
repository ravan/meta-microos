SUMMARY = "Enhanced multiple citations"
DESCRIPTION = "The mciteplus LaTeX package is an enhanced reimplementation of \
Thorsten Ohl's mcite package which provides support for the \
grouping of multiple citations together as is often done in \
physics journals. An extensive set of features provide for \
other applications such as reference sublisting."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-mciteplus-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "b8610ef2b6fcbc4c2ce52f461d7a2ec78c974433dbaca75ec1a15831d13a74377543a1602701b45a2ee0cd4720956d1136434523a700219411d4aaf62e3bf430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mciteplus.sty \
texlive-mciteplus"

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
