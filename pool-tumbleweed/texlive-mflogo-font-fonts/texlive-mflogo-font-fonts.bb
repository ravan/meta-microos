SUMMARY = "Severed fonts for texlive-mflogo-font"
DESCRIPTION = "The  separated fonts package for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2026.226.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-fonts-2026.226.1.002svn54512-61.2.noarch.rpm"
RPM_HASH = "770c92086c78573933c0c49049580718c7866c75c8f10056cd46414559eb09421651b68f662dec2581f9dfd451803748afa7e30179e87e5d5be46f6304633074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-logo10 \
font-logo8 \
font-logo9 \
font-logobf10 \
font-logod10 \
font-logosl10 \
font-logosl8 \
font-logosl9 \
texlive-mflogo-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
