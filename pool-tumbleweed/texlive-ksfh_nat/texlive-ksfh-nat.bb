SUMMARY = "BibTeX style for KSFH Munich"
DESCRIPTION = "The package supports bibliographies as standard for KSFH \
(Katholische Stiftungsfachhochschule) Munich. BibTeX entries in \
article, book, inbook, incollection and misc formats are \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-ksfh_nat-2026.226.1.1svn76790-63.2.noarch.rpm"
RPM_HASH = "73b279a367b362b0cccd9da77dc244b07c0ba4d1b6b36547750e07083292137bb03c10f0408c2ee26dfe23c9707a90bfc28402328ecb5f2ecaa5d4bdd097ad94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ksfh-nat"

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
