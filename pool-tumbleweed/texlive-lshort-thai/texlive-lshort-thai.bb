SUMMARY = "Introduction to LaTeX in Thai"
DESCRIPTION = "This is the Thai translation of the Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.32svn55643"

RPM_NAME = "texlive-lshort-thai-2026.226.1.32svn55643-59.2.noarch.rpm"
RPM_HASH = "f8c8fbbe669a64f19fd6ab9d52578a279df207aad246e28bcf9308ec67115b631813e888ae4b8e459575ce446997c4e54e5f89b44857799090ed2dc257f91e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-thai"

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
