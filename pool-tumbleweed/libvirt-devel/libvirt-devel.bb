SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-devel-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "151e82b530a36a25b1fc531609aafc3a71572b7a9efd6aab874f25e375e060b0a29015fee0a4333eacc1ddced71f24cb0daee957de8560f1446889fdbd929753"

RPROVIDES:${PN} += "libvirt-devel \
pkgconfig-libvirt \
pkgconfig-libvirt-admin \
pkgconfig-libvirt-lxc \
pkgconfig-libvirt-qemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-libs \
pkg-config \
pkgconfig-libvirt"

inherit rpm
