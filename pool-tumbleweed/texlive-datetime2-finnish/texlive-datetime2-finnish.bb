SUMMARY = "Finnish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'finnish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-2026.226.1.2svn47047-59.2.noarch.rpm"
RPM_HASH = "74eb63bb3a648f53d95b822325fa1b6c9164097589787abbfec0094083d9543cde6663cad5c178a83a0a5482f82aba55793ed4d646f0c1fefb39fb683bedfcc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-finnish-ascii.ldf \
tex-datetime2-finnish-utf8.ldf \
tex-datetime2-finnish.ldf \
texlive-datetime2-finnish"

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
