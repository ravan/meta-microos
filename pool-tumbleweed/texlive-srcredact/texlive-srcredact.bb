SUMMARY = "A tool for redacting sources"
DESCRIPTION = "This package provides a tool to keep a master source, \
consisting of different 'chunks' intended for different \
audiences. The tool allows to extract the versions intended for \
different audiences and to incorporate the changes made in any \
of these versions into the master document. This work was \
commissioned by the Consumer Financial Protection Bureau, \
United States Treasury."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn38710"

RPM_NAME = "texlive-srcredact-2026.226.1.0svn38710-64.2.noarch.rpm"
RPM_HASH = "511dd746cb51d9c11c1eb03dfe072dd3d609b01a5565a6fdcada11c6777678be84d0f102df046ac9766c5a7bbc20d84acda1c390e3c4f0f5296c63f07631d0d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcredact"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Temp \
perl-Getopt--Std \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-srcredact-bin"

inherit rpm
