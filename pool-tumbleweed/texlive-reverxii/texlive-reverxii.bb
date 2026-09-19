SUMMARY = "Playing Reversi in TeX"
DESCRIPTION = "Following the lead of xii.tex, this little (938 characters) \
program that plays Reversi. (The program incorporates some \
primitive AI.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63753"

RPM_NAME = "texlive-reverxii-2026.226.svn63753-60.4.noarch.rpm"
RPM_HASH = "13e791cc340b2dcd27e425cb8a111e301b80e1d634789a0b7b75dc6094b0611a9631bf7e97706b31248f2c69b114f1fc59c199082f7910d224759eacf7268de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reverxii.tex \
texlive-reverxii"

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
