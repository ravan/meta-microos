SUMMARY = "Severed fonts for texlive-esrelation"
DESCRIPTION = "The  separated fonts package for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-esrelation-fonts-2026.226.svn76924-59.2.noarch.rpm"
RPM_HASH = "416b779de0079a8b375f5fb7aae95ef455b99130b28e782403a7d9f65f707e4e7420ec1fd9321cf9ecd05be40255e9b9a420d16c378c255be79109af0d3380ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-esrelation10 \
texlive-esrelation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
