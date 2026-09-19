SUMMARY = "Bibliography style for German texts"
DESCRIPTION = "Bibliography style files intended for texts in german. They \
draw up bibliographies in accordance with the german DIN 1505, \
parts 2 and 3."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.5svn76790"

RPM_NAME = "texlive-dinat-2026.226.2.5svn76790-59.2.noarch.rpm"
RPM_HASH = "d698d739c5992cf40a86bff4a5df945ebf6c77e94e813b220b5e7163afde1415982924f59e6ba9de2a266d4b668993da40e4d4ee4e759916c5f80e37a0ea80f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dinat"

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
