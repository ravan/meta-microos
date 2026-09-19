SUMMARY = "Czech translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "This is the Czech translation of 'A Short Introduction to \
LaTeX2e'."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.27svn55643"

RPM_NAME = "texlive-lshort-czech-2026.226.4.27svn55643-61.2.noarch.rpm"
RPM_HASH = "3220bc3182c33fd704ad0109c8cd6d0807375e03917c12d90c5ea521dbc33ae24900318d2e0b7242e0c361da8f47296b6fbb3cd9639a929942857fdb4a78e8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-czech"

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
