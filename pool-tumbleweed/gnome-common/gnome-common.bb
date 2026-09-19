SUMMARY = "Common Files to Build GNOME"
DESCRIPTION = "Gnome-common includes files used by to build GNOME and GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.18.0"

RPM_NAME = "gnome-common-3.18.0-3.20.noarch.rpm"
RPM_HASH = "47bf49abdf6cc00f8ac0f82c2b2ff3f3aff063190f82fc60eb020f74497ec66005940f7db00ae4fb63e5d2f28efaead16f354f2928063ecc313279ecd47aa31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-common"

RDEPENDS:${PN} += "/usr/bin/sh \
autoconf \
autoconf-archive \
automake \
gettext-tools \
glib2-devel \
gtk-doc \
intltool \
libtool \
pkgconfig \
yelp-tools"

inherit rpm
