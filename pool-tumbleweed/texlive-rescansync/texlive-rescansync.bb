SUMMARY = "Re-scan tokens with synctex information"
DESCRIPTION = "Allow users to execute saved code to typeset text while \
preserving SyncTeX information."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-rescansync-2026.226.0.0.0.0svn76924-60.4.noarch.rpm"
RPM_HASH = "cddccc326b01f612daae50b61ad15afec4427406aa46d2e87fe5949f1038b426bd36959a19698b7572ff8d337264349dae4ebee013088d88a7933939f80e8eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rescansync.sty \
texlive-rescansync"

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
