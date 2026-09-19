SUMMARY = "Severed fonts for texlive-zapfding"
DESCRIPTION = "The  separated fonts package for texlive-zapfding"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-zapfding-fonts-2026.226.svn77161-59.4.noarch.rpm"
RPM_HASH = "c7aefb372f1ae02592c762ac7e9afdbee235af05395c30e107203e3ebc5f44f3d2a2799de8a91c2d416ff0b4e6ebdc850bc519fd20b772ac3422f182c6f054c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dingbats \
texlive-zapfding-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
