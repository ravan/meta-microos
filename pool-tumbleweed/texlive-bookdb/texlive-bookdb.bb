SUMMARY = "A BibTeX style file for cataloguing a home library"
DESCRIPTION = "This package provides an extended book entry for use in \
cataloguing a home library. The extensions include fields for \
binding, category, collator, condition, copy, illustrations, \
introduction, location, pages, size, value, volumes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76790"

RPM_NAME = "texlive-bookdb-2026.226.0.0.2svn76790-59.2.noarch.rpm"
RPM_HASH = "8e08b26101e0d45ff8811ee70f2aae3b1a33666c40d6c64da615ad946a41294d49476d326bbb3eeb50cf4e3887f94df7a43b75ea274b317b42786005d509ec8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb"

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
