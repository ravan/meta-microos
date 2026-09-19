SUMMARY = "Read and parse text tables"
DESCRIPTION = "This experimental package can read and parse text tables \
delimited by user-defined tokens (e.g., tab). It can be used \
for serial letters and the like, making it easier to export the \
data file from MS-Excel/MS-Word"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn16549"

RPM_NAME = "texlive-delimtxt-2026.226.svn16549-59.2.noarch.rpm"
RPM_HASH = "c27979aff05db86aef3883898a69328ab2fcf0dd75cb8bc0dc72e4e9e3f82a29acf3c39ea10ee37c8f7ebed7d0f2a52fd724fd36e5d4c1c37b1ae96928521299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimtxt.sty \
texlive-delimtxt"

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
