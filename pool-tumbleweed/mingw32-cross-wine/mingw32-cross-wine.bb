SUMMARY = "Wine cross runtime"
DESCRIPTION = "This package contains a ready to use wine prefix for \
running cross compiled applications while building \
packages, for example cross compiled test"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "mingw32-cross-wine-1.3.3-2.5.noarch.rpm"
RPM_HASH = "0d57ef09895a9d735b634fab9524c938caac47bc7d15a9aab7ab9a637f4073a6a695a9e0fa7986e0db915d466277156901d294b5b39ac9c11a90ef85bab96cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-wine \
rpm-macro--mingw32-cross-wine-enable-dns \
rpm-macro--mingw32-cross-wine-init \
rpm-macro--mingw32-cross-wine-run \
rpm-macro--mingw32-cross-wine-start-session \
rpm-macro--mingw32-cross-wine-wine-major-version"

RDEPENDS:${PN} += "mingw32-filesystem \
wget \
wine-binfmt-standalone \
winetricks \
xorg-x11-server \
xvfb-run"

inherit rpm
