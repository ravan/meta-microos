SUMMARY = "LXC container runtime library development files"
DESCRIPTION = "This package provides the LXC container runtime library development files."
LICENSE = "LGPL-2.1-only"

PV = "7.0.0"

RPM_NAME = "liblxc-devel-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "38e29be41f508a9fe07bd6d68e30235d15081ec4241b444b2be98524ed9139a39f73ddad0722978ae142e9b97977fdd00a02eb16c1f135369134bba646b17be7"

RPROVIDES:${PN} += "liblxc-devel \
pkgconfig-lxc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxc1 \
pkgconfig-dbus-1 \
pkgconfig-libcap \
pkgconfig-libseccomp \
pkgconfig-libselinux"

inherit rpm
