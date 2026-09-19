SUMMARY = "Severed fonts for texlive-gelasiomath"
DESCRIPTION = "The  separated fonts package for texlive-gelasiomath"
LICENSE = "OFL-1.1"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gelasiomath-fonts-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "80484a61f826106399c79a958e15869506b11b2710a2e3bdeda862b265a3649b08fa1b9df8f53f692380e8687fe2da3d1c921acecbf2754347bd073a80627ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-gelasiomath \
font-xchartermath \
texlive-gelasiomath-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
