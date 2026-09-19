SUMMARY = "Severed fonts for texlive-symbol"
DESCRIPTION = "The  separated fonts package for texlive-symbol"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-symbol-fonts-2026.226.svn77161-64.2.noarch.rpm"
RPM_HASH = "fee489883f90b910ac24d9296769239ce3e81ef2a1944ffe45202307a39cff0344a8e197ffbf76a76f5ec17c6062d0b0fd6fc05034f0218765f08bcf70572948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-standardsymbolsl \
texlive-symbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
