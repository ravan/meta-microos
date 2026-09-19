SUMMARY = "Severed fonts for texlive-belleek"
DESCRIPTION = "The  separated fonts package for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn66115"

RPM_NAME = "texlive-belleek-fonts-2026.226.svn66115-61.2.noarch.rpm"
RPM_HASH = "b5ee2bba16be0396d9fa536fe6d2d43b664355a6e14d75aed575aee3d3023c9fd6973411ec854b93cfe10e946a99b55b8c283733ec9e77899b2a875059c79484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-belleek-fonts \
font-blex \
font-blsy \
font-rblmi \
texlive-belleek-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
