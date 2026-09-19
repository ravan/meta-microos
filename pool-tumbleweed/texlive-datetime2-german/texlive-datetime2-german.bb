SUMMARY = "German language module for the datetime2 package"
DESCRIPTION = "This module provides the 'german' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn67201"

RPM_NAME = "texlive-datetime2-german-2026.226.3.0svn67201-59.2.noarch.rpm"
RPM_HASH = "9e433be709dd6261e948a8fb64beb020a2e2a4d97ede94b0c2a5ad43b4c0fe02000741abed0beb1dbb2f699ac74402bc1ac61922449a35191cfdebb5f35d21f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-de-AT.ldf \
tex-datetime2-de-CH.ldf \
tex-datetime2-de-DE.ldf \
tex-datetime2-german-base-ascii.ldf \
tex-datetime2-german-base-utf8.ldf \
tex-datetime2-german-base.ldf \
tex-datetime2-german.ldf \
texlive-datetime2-german"

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
