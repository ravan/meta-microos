SUMMARY = "Severed fonts for texlive-fourier"
DESCRIPTION = "The  separated fonts package for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-fourier-fonts-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "4ac9fd2b7ab1ef968813095179564afbd21c352a1ebea1418961a3b55f77be46e864169d28549b472da082e84e4bd267112ec2bb91e0f1498893ff0c61896c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fourier-fonts \
font-fourier-alternate-black \
font-fourier-alternate-bold \
font-fourier-alternate-bolditalic \
font-fourier-alternate-italic \
font-fourier-alternate-roman \
font-fourier-alternate-semibold \
font-fourier-alternate-semitalic \
font-fourier-math-blackboard \
font-fourier-math-cal \
font-fourier-math-extension \
font-fourier-math-letters \
font-fourier-math-symbols \
font-fourier-orns \
font-fourierorns \
texlive-fourier-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
