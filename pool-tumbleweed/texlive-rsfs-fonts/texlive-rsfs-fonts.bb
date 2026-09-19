SUMMARY = "Severed fonts for texlive-rsfs"
DESCRIPTION = "The  separated fonts package for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rsfs-fonts-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "e14026e8cd8149a4306058b94d37fd250fc4d9f78ece6678ecb1dfb9a13bc3c2fd8db7f646885413ea48d4dff61ec832c5053e9d094db7a9441538706cca2e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-rsfs10 \
font-rsfs5 \
font-rsfs7 \
texlive-rsfs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
