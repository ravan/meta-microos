SUMMARY = "Create tear-off stubs at the bottom of a page"
DESCRIPTION = "The \\stubs command creates as many repetitions as possible of \
its argument, at the bottom of the page; these stubs may be \
used (for example) for contact information."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1svn75437"

RPM_NAME = "texlive-stubs-2026.226.0.0.1.1svn75437-64.2.noarch.rpm"
RPM_HASH = "9a0a4d1fa24fb5598d551c6353fdd084521cd2dc7bead8f482d83d854a3b49daee1297afca742cfba80a1057ce8f7205ddafcf8035ed764f020d74f7efaa56e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stubs.sty \
texlive-stubs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
