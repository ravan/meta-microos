SUMMARY = "Tabular-like environments with named columns"
DESCRIPTION = "This package implements a variant of tabular-like environments \
where columns can be given a name and entries can flexibly be \
placed between arbitrary columns. Complex alignment-based \
layouts, for example for program code, are possible. The \
package depends on lazylist."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.6svn77682"

RPM_NAME = "texlive-polytable-2026.226.0.0.8.6svn77682-59.2.noarch.rpm"
RPM_HASH = "bb8d0294321fbd4ea527bb0977f5cab649abbe0f5394a7e12e008b6a7daa6885c5ea4c4a61f7013b8034277c2aad46ad49ead0bd82a601a3b9a6d31f7c7f93d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polytable.sty \
texlive-polytable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-lazylist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
