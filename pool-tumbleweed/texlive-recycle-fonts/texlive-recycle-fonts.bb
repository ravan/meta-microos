SUMMARY = "Severed fonts for texlive-recycle"
DESCRIPTION = "The  separated fonts package for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-recycle-fonts-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "3dfa9f5a345333e689770a32bba68a8fab0bcd9fe55f838c0c486987af324b32639be20dda1f76e5ee8b169c8a43f062a0ea0de84e162f92130aab668a1d606a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-recycle \
texlive-recycle-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
