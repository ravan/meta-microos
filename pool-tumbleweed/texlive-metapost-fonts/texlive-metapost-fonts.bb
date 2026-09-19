SUMMARY = "Severed fonts for texlive-metapost"
DESCRIPTION = "The  separated fonts package for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-metapost-fonts-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "47de9ed8ca9bd81b41e1fed4abb73400216aa8d5915d9a37220f4d685064714c97e495bc161638d9695048da7eda1004d83092c4b33e047f9f8f5cdd374185b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-freeeuro \
texlive-metapost-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
