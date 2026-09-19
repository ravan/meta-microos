SUMMARY = "A Collection of Free Arabic Fonts"
DESCRIPTION = "A collection of free Arabic fonts available from \
http://www.arabeyes.org/resources.php."
LICENSE = "GPL-2.0-only & SUSE-Public-Domain & OFL-1.1"

PV = "0.20161120"

RPM_NAME = "arabic-fonts-0.20161120-18.23.noarch.rpm"
RPM_HASH = "32c00b20c26af08f7c78ee2e167b25dd83223a0866ec96eb3e75aec70523596fb4304478aa7f4a137269b5155b1d82650d946fd1e5ebe20640f4ed6d949421b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-fonts \
fonts-arabic \
locale-ar \
scalable-font-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
arabic-ae-fonts \
arabic-bitmap-fonts \
arabic-kacst-fonts \
arabic-kacstone-fonts \
arabic-naqsh-fonts \
coreutils \
perl"

inherit rpm
