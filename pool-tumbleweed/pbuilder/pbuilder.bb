SUMMARY = "Personal package builder for .deb packages"
DESCRIPTION = "pbuilder constructs a chroot system, and builds a package inside the \
chroot. It uses apt extensively, and a local mirror, or a fast \
connection to a Debian/Ubuntu mirror is ideal, but not necessary. \
 \
'pbuilder create' uses debootstrap to create a chroot image. \
 \
'pbuilder update' updates the image to the current state of \
testing/unstable/whatever \
 \
'pbuilder build' takes a *.dsc file and builds a binary in the chroot \
image. \
 \
pdebuild is a wrapper for developers, to allow running pbuilder \
just like 'debuild', as a normal user."
LICENSE = "GPL-2.0-or-later"

PV = "0.231.1"

RPM_NAME = "pbuilder-0.231.1-1.3.noarch.rpm"
RPM_HASH = "a6ff907afc65240afa14e086980aa5f7cfcd5b70e0e380ecc25d82134c316ebb5211a2f36b8cbea436b8ac36d0936698d5cf7c1415e7f837e389842119fbc341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pbuilder \
pbuilder"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
debootstrap \
dpkg \
wget"

inherit rpm
