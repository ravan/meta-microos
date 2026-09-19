SUMMARY = "Introduction to LaTeX in Portuguese"
DESCRIPTION = "This is the Portuguese translation of A Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.5.01.0svn55643"

RPM_NAME = "texlive-lshort-portuguese-2026.226.5.01.0svn55643-61.2.noarch.rpm"
RPM_HASH = "bcaa08f79c611bebf8a8e0c7dc0cf9687203d79b3c6cccbd77294898cf17055dd29d01303bb76e94739d0ea7aeab2aab3a91c4f4a50bedccdb163eb1ccc95b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-portuguese"

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
