SUMMARY = "Typeset 'comma-below' letters, as in Romanian"
DESCRIPTION = "The package defines a command \\cb that positions a comma below \
a letter, as required (for example) in Romanian typesetting. \
The command is robust, but interferes with hyphenation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-2026.226.0.0.99fsvn18462-60.2.noarch.rpm"
RPM_HASH = "5d6c9bfde8a473c354f00035a34b6aac1eead23b330727fa898583a7526ff916f8e6c80efb4b2b218123bfd83b62ad1c275627ac53bb345355f12b04581d9edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combelow.sty \
texlive-combelow"

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
