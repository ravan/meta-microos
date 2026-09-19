SUMMARY = "BibTeX styles to format according to GOST"
DESCRIPTION = "BibTeX styles to format bibliographies in English, Russian or \
Ukrainian according to GOST 7.0.5-2008 or GOST 7.1-2003. Both \
8-bit and Unicode (UTF-8) versions of each BibTeX style, in \
each case offering a choice of sorted and unsorted. Further, a \
set of three styles (which do not conform to current standards) \
are retained for backwards compatibility."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2lsvn76790"

RPM_NAME = "texlive-gost-2026.226.1.2lsvn76790-60.4.noarch.rpm"
RPM_HASH = "3704102e0038cbcd289600404bb98170fdcc950c3dc04886e00c7d56b324214ac73749455e3aa632c43802c671a4d3d1dae62d372bd7120f372ee00ded3ad3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gost"

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
