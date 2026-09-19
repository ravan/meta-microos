SUMMARY = "LaTeX template for theses at Southeastern University"
DESCRIPTION = "This template is for theses at Southeastern University, \
Nanjing, China."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-2026.226.2.1.2svn33042-60.2.noarch.rpm"
RPM_HASH = "519ebf60eedad959355d4a854b9705a4e09627188d2a9e5a80a558216b855b7e19a27dbe6d625103265aa6df989eea4edeecb35449e0ef0ca52882bc27a61a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seuthesis"

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
