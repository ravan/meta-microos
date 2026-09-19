SUMMARY = "Severed fonts for texlive-svrsymbols"
DESCRIPTION = "The  separated fonts package for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-fonts-2026.226.2.0bsvn50019-64.2.noarch.rpm"
RPM_HASH = "bddb710867869697eb4efe3fdf7a67957c7fb196242bd97e86e31154a71d95bb1c2736b15dd8d500dd9ae346fbc72ffb308f7784b529e3df24423f9cf595e415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-svrsymbols-fonts \
font-svrsymbols \
texlive-svrsymbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
