SUMMARY = "Severed fonts for texlive-emo"
DESCRIPTION = "The  separated fonts package for texlive-emo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-emo-fonts-2026.226.0.0.4svn77682-61.4.noarch.rpm"
RPM_HASH = "32015689396da2ee6f685ec208652885a33f157eea6b99fadcc32bd1c13abcb2f30c9bee98c8f6fbf31bf657eb0580815a25f8420d478b263bc67ac555bb31da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-notoseriftc \
texlive-emo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
