SUMMARY = "Severed fonts for texlive-cmupint"
DESCRIPTION = "The  separated fonts package for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn54735"

RPM_NAME = "texlive-cmupint-fonts-2026.226.1.1svn54735-60.2.noarch.rpm"
RPM_HASH = "d760beafc450c5d7b4701b012569525ec109ae05db3e61bb098d2e269b4a5b36d2f4fa9e1bf931ec3f692142310f29c43a9f87030d30350cdb1668e96e6cf34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cmupint \
texlive-cmupint-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
