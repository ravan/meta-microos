SUMMARY = "Additional Forest libraries providing bug fixes, extensions and support for tagging"
DESCRIPTION = "forest-ext is a new package offering additional libraries for \
Forest: ext.tagging supports tagging forest trees ext.multi \
provides styles for limited inclusion of children with multiple \
parents ext.utils provides some utilities and miscellaneous \
styles ext.ling provides some simple extensions for \
linguistics, but currently only one is enabled Debugging \
versions of all libraries are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78039"

RPM_NAME = "texlive-forest-ext-2026.226.0.0.3svn78039-60.2.noarch.rpm"
RPM_HASH = "8f01699deb50a426d3204aa90d582a7bcc3138dd05a2655aca606c15652d56726d62cf71619c9f5a11314e0b8dbb7886585f288bc8495327deeafd4db2d127e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forest-lib-ext.ling-debug.sty \
tex-forest-lib-ext.ling.sty \
tex-forest-lib-ext.multi-debug.sty \
tex-forest-lib-ext.multi.sty \
tex-forest-lib-ext.tagging-debug.sty \
tex-forest-lib-ext.tagging.sty \
tex-forest-lib-ext.utils-debug.sty \
tex-forest-lib-ext.utils.sty \
texlive-forest-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-memoize-ext-debug.sty \
tex-memoize-ext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
