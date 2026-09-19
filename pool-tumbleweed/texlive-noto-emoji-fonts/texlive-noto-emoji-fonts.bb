SUMMARY = "Severed fonts for texlive-noto-emoji"
DESCRIPTION = "The  separated fonts package for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2026.226.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-fonts-2026.226.2.034svn62950-61.2.noarch.rpm"
RPM_HASH = "14da77d48678b87fad238fb2b24b07a3c3d67776726ee4dbcaed6346200b8163a9160257b8b2ee041d2f1aaa36039a20d8ebd1d027d1e72f3b57eab465bb4646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=und-zsye \
font-notocoloremoji \
font-notoemoji \
texlive-noto-emoji-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
