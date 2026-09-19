SUMMARY = "Severed fonts for texlive-figbas"
DESCRIPTION = "The  separated fonts package for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn28943"

RPM_NAME = "texlive-figbas-fonts-2026.226.1.0.3svn28943-59.2.noarch.rpm"
RPM_HASH = "d859c48c7955fd3296d68b41ae1e2817c41592e7ea61d53020cf528342c77eecc862c3039fd52528b5102d2c580d64e63dd4cfdf84e3daf1e4f253646871fdfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-computermodern \
font-texpalladiol \
texlive-figbas-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
