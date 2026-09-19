SUMMARY = "Configuration and base files for MFLua"
DESCRIPTION = "For information on this Lua-enabled Metafont, see, for example: \
tug.org/TUGboat/tb32-2/tb101scarso.pdf."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-mflua-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "1e84364872c36d58ad07df202cb3c9abc346dbfe454d7593ee0275006ced1c1870139c4cfe55ed76d2b7fa3434da9789d20ef13ba9f980ae8b9052a2de94ce63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatex \
texlive-metafont \
texlive-mflua-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
