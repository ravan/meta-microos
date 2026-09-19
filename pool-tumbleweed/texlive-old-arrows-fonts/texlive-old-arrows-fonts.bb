SUMMARY = "Severed fonts for texlive-old-arrows"
DESCRIPTION = "The  separated fonts package for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-old-arrows-fonts-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "255ac55f09f8a57e1e0fb4e3561ff6f855a30dfc1e3f904f3a6dea266b2ea25b02173e8074c6bdbef3576f981f8aaa11d5f27da5155d9b2e8c5a57f49d2c5c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-oldarrows \
texlive-old-arrows-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
