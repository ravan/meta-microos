SUMMARY = "A BibTeX style that outputs HTML"
DESCRIPTION = "noTeX.bst produces a number of beautifully formatted HTML P \
elements instead of TeX code. It can be used to automatically \
generate bibliographies to be served on the web starting from \
BibTeX files."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-notex-bst-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "f20c225e4364d2ab13acdc6680c93bdc283ac18eaa903f3d5d010a4ca68d9e3ffe150ab2ce3e1086c7678fb527e0f99bb35df628279d8fea2e5e950523e67f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notex-bst"

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
