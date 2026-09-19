SUMMARY = "Fonts for typesetting Tolkien Elvish scripts"
DESCRIPTION = "The bundle provides fonts for Cirth (cirth.mf, etc.) and for \
Tengwar (teng10.mf). The Tengwar fonts are supported by macros \
in teng.tex, or by the (better documented) tengtex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-elvish-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "0400b834c264134556745f1da0c89c975106d05c3126f08870d52a727dea4eb8919770e74a8db7ceb663e8df968cb6c39901a4773942ff6fe54dd8acb67f595f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cirth.tfm \
tex-teng10.tfm \
texlive-elvish"

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
