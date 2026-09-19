SUMMARY = "Collection of calendars based on the PocketDiary-module"
DESCRIPTION = "The module contains examples for creating calendars based on \
the PocketDiary-module in various page sizes. In this \
collection there are the following examples: Year calendar with \
1 day per page Year calendar with 1 week per two facing pages \
Menu-Calendar for each week of the year Sun data and moon data \
calendar for the whole year Photo calendar"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn66947"

RPM_NAME = "texlive-context-calendar-examples-2026.226.svn66947-61.2.noarch.rpm"
RPM_HASH = "f70d74d2d881f1dca5ee9e05f804bb436d13e350eae2b1e7f2e8a321968788eecdaca55064e6a5ed479ed65e98575afb6e733c3412f5ee24e40b36f2c28dc8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-calendar-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
