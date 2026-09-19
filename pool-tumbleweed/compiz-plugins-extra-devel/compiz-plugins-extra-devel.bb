SUMMARY = "OpenGL window and compositing manager community extra plugins"
DESCRIPTION = "This package contains the community extra Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-devel-0.8.18-2.6.aarch64.rpm"
RPM_HASH = "4cb135a516eef688007dbeadfa3a950ede4452bd446dbc504c3f504ce939853d43ece618f1b164a08893786ac389e8f4c65ab46aa5cb90c1242d10dc17f8f2e7"

RPROVIDES:${PN} += "compiz-fusion-plugins-extra-devel \
compiz-plugins-extra-devel \
pkgconfig-compiz-animationaddon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins-extra \
pkgconfig \
pkgconfig-bcop \
pkgconfig-cairo \
pkgconfig-compiz \
pkgconfig-compiz-animation \
pkgconfig-compiz-cube \
pkgconfig-compiz-mousepoll \
pkgconfig-compiz-scale \
pkgconfig-compiz-text \
pkgconfig-gl \
pkgconfig-libnotify"

inherit rpm
