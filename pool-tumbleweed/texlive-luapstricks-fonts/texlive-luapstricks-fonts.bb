SUMMARY = "Severed fonts for texlive-luapstricks"
DESCRIPTION = "The  separated fonts package for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn77336"

RPM_NAME = "texlive-luapstricks-fonts-2026.226.0.0.11svn77336-59.2.noarch.rpm"
RPM_HASH = "ebd02d2c051177862f1678eea5ffefc4ad7a594b240199f55a50b7649d6ec97c015ef3a58fb929fefa2529e6722a313e04a9dd0c25f4047fb1b9329ae39724c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pstricksdotfont \
texlive-luapstricks-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
