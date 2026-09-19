SUMMARY = "Collection of GStreamer effects -- Development Files"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gnome-video-effects-devel-0.6.0-1.9.noarch.rpm"
RPM_HASH = "87225bfeb07b69fdebb75c5730a56c4ce2e72b30e0c86e6433d578b7d08b71496f679ef61fa5e02e32ac0c2ca9a0b0f176ffcb09d6f2abe2fb5689ea55fc0af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects-devel \
pkgconfig-gnome-video-effects"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-video-effects"

inherit rpm
