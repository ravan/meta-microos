SUMMARY = "BibLaTeX style for the Ecole nationale des chartes (Paris)"
DESCRIPTION = "This package provides a citation and bibliography style for use \
with BibLaTeX. It conforms to the bibliographic standards used \
at the Ecole nationale des chartes (Paris), and may be suitable \
for a more general use in historical and philological works. \
The package was initially derived from historische-zeitschrift, \
with the necessary modifications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn73019"

RPM_NAME = "texlive-biblatex-enc-2026.226.1.1svn73019-61.2.noarch.rpm"
RPM_HASH = "0391f43ed4aae47c61e95e485e7a6093fb96f122c8d770efa549f1fb3e99dc7651ed2db4beeef09a19d228d268292a683dac81c14a286691380982a8c3828f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enc.bbx \
tex-enc.cbx \
texlive-biblatex-enc"

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
