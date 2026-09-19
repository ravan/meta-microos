SUMMARY = "Severed fonts for texlive-gfsporson"
DESCRIPTION = "The  separated fonts package for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gfsporson-fonts-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "d05bc0b13a1e4cc0b62b982e6bad84e5fb0a4c81f23fd436d32d3e9608c44b993aad827c2bdd0ed5051b878d3217669fdda5016389eabab187ca72c5fafe08ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfsporson-fonts \
font--lang=el \
font-gfsporson \
font-gfsporsonrg \
texlive-gfsporson-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
