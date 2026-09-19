SUMMARY = "Magyar language module for the datetime2 package"
DESCRIPTION = "This module provides the 'magyar' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-2026.226.1.1svn48266-59.2.noarch.rpm"
RPM_HASH = "b2ae5a7f710695f2f8ba67d553692d61e7968f2cdffcad14bbf5c1e1e3a384b279e3f1dca820f55f7abd0d67a901127df25066fe3bb42c2f5e370ae52eaf758f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-magyar-ascii.ldf \
tex-datetime2-magyar-utf8.ldf \
tex-datetime2-magyar.ldf \
texlive-datetime2-magyar"

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
