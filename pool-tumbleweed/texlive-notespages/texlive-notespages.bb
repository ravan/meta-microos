SUMMARY = "Filling documents with notes pages and notes areas"
DESCRIPTION = "This package provides one macro to insert a single notes page \
and another to fill the document with multiple notes pages, \
until the total number of pages (so far) is a multiple of a \
given number. A third command can be used to fill half empty \
pages with a notes area."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.1svn76790"

RPM_NAME = "texlive-notespages-2026.226.0.0.8.1svn76790-61.2.noarch.rpm"
RPM_HASH = "5c8485baf20ad8c1bf8992400df270a9e3eb6a74725b3d784ebffc2912ce429751a1d4808fc993f883382f9728e38c7a02dd9702b1210d65372a3165b0051c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notespages.sty \
texlive-notespages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
