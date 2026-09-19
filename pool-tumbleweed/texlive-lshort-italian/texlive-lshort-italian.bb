SUMMARY = "Introduction to LaTeX in Italian"
DESCRIPTION = "This is the Italian translation of the Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.2svn57038"

RPM_NAME = "texlive-lshort-italian-2026.226.6.2svn57038-61.2.noarch.rpm"
RPM_HASH = "c084dead6c3957ee5c5c7d9c1746fa910d4b2e23d37da1560754d92cded6044d72c54b7168ea6deb5dbea1170f14bf70b0d757e5c293e7f139cc4f67b1102e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-italian"

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
