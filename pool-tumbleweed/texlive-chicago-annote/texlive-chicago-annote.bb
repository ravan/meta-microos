SUMMARY = "Chicago-based annotated BibTeX style"
DESCRIPTION = "This is a revision of chicagoa.bst, using the commonly-used \
annote field in place of the original's annotation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-chicago-annote-2026.226.svn76790-60.2.noarch.rpm"
RPM_HASH = "5147fbe5ef782c318e44e5e161d795f14344dbecb413d13411ed3e475a6bd5d40293563d4febf8d2883d5b02457e301bc32648eb697e9a22879352e92efeede6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote"

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
