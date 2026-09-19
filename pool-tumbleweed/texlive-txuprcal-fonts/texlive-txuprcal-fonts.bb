SUMMARY = "Severed fonts for texlive-txuprcal"
DESCRIPTION = "The  separated fonts package for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.00svn77682"

RPM_NAME = "texlive-txuprcal-fonts-2026.226.1.00svn77682-59.2.noarch.rpm"
RPM_HASH = "8340a59cc182783976a07e9b79ff218b7817acb68d4081bd37b97cf3a64c7abb920cebec1dd6c20e9293a91b83e108a2394bdd2de3377bdca681fd5ea5817304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-txuprcal \
texlive-txuprcal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
