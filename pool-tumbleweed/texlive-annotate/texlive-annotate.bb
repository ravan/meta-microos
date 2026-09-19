SUMMARY = "A bibliography style with annotations"
DESCRIPTION = "The style is a derivative of the standard alpha style, which \
processes an entry's annotate field as part of the printed \
output."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-annotate-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "bea55597666ca74d703b93f7ac452b122808ca4db29bef2affb1d151224d5455a9d5437d8eef98d8ff6155c63637aeab1d7e667a6ce58586cd01e508ed761485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate"

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
