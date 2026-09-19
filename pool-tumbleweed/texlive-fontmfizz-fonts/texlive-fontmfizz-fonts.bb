SUMMARY = "Severed fonts for texlive-fontmfizz"
DESCRIPTION = "The  separated fonts package for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn43546"

RPM_NAME = "texlive-fontmfizz-fonts-2026.226.svn43546-60.2.noarch.rpm"
RPM_HASH = "0f6359b56e1efe9029989e7610ff9ce21d73f3384e2756677f9cfe2c7273ed11e9d02b3c212272241a512d5ce9e34eedf9d931c96ccb7e632bbdb6a55fc8d74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-font-mfizz \
texlive-fontmfizz-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
