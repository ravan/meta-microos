SUMMARY = "Lxappearance development files"
DESCRIPTION = "Development files to build lxappearance plugins"
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-devel-0.6.3-1.30.aarch64.rpm"
RPM_HASH = "dec28f7600915d704f251a907a054248a5f0b3863098c8bbc992c1b3f7ca77e21258da17793d733cf2228b7e2cc24b642c8c8a64167f56476349b5beae485e1d"

RPROVIDES:${PN} += "lxappearance-devel \
pkgconfig-lxappearance"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lxappearance \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
