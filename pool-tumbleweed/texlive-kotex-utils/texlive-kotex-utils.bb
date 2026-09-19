SUMMARY = "Utility scripts and support files for typesetting Korean"
DESCRIPTION = "The bundle provides scripts and support files for index \
generation in Korean language typesetting. The files belong to \
the ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-2026.226.2.1.0svn38727-63.2.noarch.rpm"
RPM_HASH = "ba66e5c9f81515602a7ae204d0adfb4503e508cbec70b289316fa8505be14bea8b5ff6c2b72f90e3448f5c7a2b80ae23f44b98e4a6840d3034cf6ef429cbc2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Copy \
perl-File--Path \
perl-Getopt--Std \
sed \
texlive \
texlive-filesystem \
texlive-kotex-utf \
texlive-kotex-utils-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
