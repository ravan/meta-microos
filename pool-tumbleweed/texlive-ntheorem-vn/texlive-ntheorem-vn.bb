SUMMARY = "Vietnamese translation of documentation of ntheorem"
DESCRIPTION = "This is a translation of the documentation provided with \
ntheorem."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.203svn15878"

RPM_NAME = "texlive-ntheorem-vn-2026.226.1.203svn15878-61.2.noarch.rpm"
RPM_HASH = "da39c7235a16bba3a9fe6266cf95408f3337fa2ae8e45f292d041b0026a1bab608274c9e6063c34e9977d596c25a9348a7881123b144e23a8919bd117fe41000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ntheorem-vn"

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
