SUMMARY = "Make chapters be typeset like sections"
DESCRIPTION = "The command \\simplechapter sets up the \\chapter command not to \
number chapters, though they may possibly have a prefix, and a \
suffix (the \\simplechapterdelim command, which the user may \
alter). The \\restorechapter command restores the status quo \
ante."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-anonchap-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "180a4f6c58b6ab8a7f2361d23fcdd5d4a1b26cb8dd020da0ee30adbbb1fcf1548c3ce2af55c566f2264701619b7358720fdcc115eefda8dc1142c8771fc58416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anonchap.sty \
texlive-anonchap"

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
