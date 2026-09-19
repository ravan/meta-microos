SUMMARY = "Russian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'russian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-2026.226.1.1svn49345-59.2.noarch.rpm"
RPM_HASH = "47c11e51d71d4c4bd741f9cddbe916f14930ce3d08f15a25cc13c4997a221feac69d4053ef50c3fa98e05597841cd6e78a010328ad0a55ef28187b2cf1e57e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-russian-ascii.ldf \
tex-datetime2-russian-utf8.ldf \
tex-datetime2-russian.ldf \
texlive-datetime2-russian"

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
