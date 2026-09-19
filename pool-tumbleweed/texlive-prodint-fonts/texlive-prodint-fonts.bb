SUMMARY = "Severed fonts for texlive-prodint"
DESCRIPTION = "The  separated fonts package for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2026.226.svn21893"

RPM_NAME = "texlive-prodint-fonts-2026.226.svn21893-59.2.noarch.rpm"
RPM_HASH = "75338a3e6e0e4585586d92617945f490d671bf37e4a2ff892b00ac21dc28524b47d53469fa145424ad9b46af7ad40e0001d27d4c01355a237ab1a33a765b026d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-prodint \
texlive-prodint-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
