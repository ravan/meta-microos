SUMMARY = "Utility programs for Polish users of TeX"
DESCRIPTION = "Provided as sources, not installed in the bin directories."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-gustprog-2026.226.svn54074-60.4.noarch.rpm"
RPM_HASH = "0e7c12746ad41cdcb16c3ac80f17ca4964f9d754354b69034743175f19ca7a78495ccc8b8de34089c0c64b64b8e0e92a5cd35426664e267f6bb7db03f0ba6708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustprog"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
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
