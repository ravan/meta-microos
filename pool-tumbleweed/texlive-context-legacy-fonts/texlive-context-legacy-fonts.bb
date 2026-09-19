SUMMARY = "Severed fonts for texlive-context-legacy"
DESCRIPTION = "The  separated fonts package for texlive-context-legacy"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78010"

RPM_NAME = "texlive-context-legacy-fonts-2026.226.svn78010-61.2.noarch.rpm"
RPM_HASH = "ebf8aa46422470724342adcc47737def9e38c843368bcb600c79805871d429d921217dbbf549d5563975fe63e2c3e9dc3ca581739a030e20f01347e9f305d8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-contextnavigation \
texlive-context-legacy-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
