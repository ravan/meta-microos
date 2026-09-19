SUMMARY = "Wine cross runtime"
DESCRIPTION = "This package contains a ready to use wine prefix for \
running cross compiled applications while building \
packages, for example cross compiled test"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "mingw64-cross-wine-1.3.3-1.5.noarch.rpm"
RPM_HASH = "c4aba698fb887b49f1210208c9b1bcbf6d70847e01ec2847bfc4ca505732690c7535fc6f7850af1103ce1d37a33877754253a8f008417cd2127068eaee07b624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-wine \
rpm-macro--mingw64-cross-wine-enable-dns \
rpm-macro--mingw64-cross-wine-init \
rpm-macro--mingw64-cross-wine-run \
rpm-macro--mingw64-cross-wine-start-session"

RDEPENDS:${PN} += "mingw64-filesystem \
wget \
wine-binfmt-standalone \
winetricks \
xorg-x11-server \
xvfb-run"

inherit rpm
