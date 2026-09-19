SUMMARY = "French language module for glossaries package"
DESCRIPTION = "French language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-2026.226.1.1svn42873-60.4.noarch.rpm"
RPM_HASH = "4cf4b8037f5d2bcc936d6a068c18210312b4481b5b97ec5e35fafb973bdc8f7a2418a0ea90b14a99abb7faf79884cb4fdc8635bfdaf9286bbc82bcec665a3fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-french.ldf \
texlive-glossaries-french"

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
