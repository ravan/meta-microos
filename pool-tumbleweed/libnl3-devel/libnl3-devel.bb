SUMMARY = "Libraries and headers for libnl"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.12.0"

RPM_NAME = "libnl3-devel-3.12.0-1.5.aarch64.rpm"
RPM_HASH = "2922b42da9739502efa203aa3c88608be19f213b82cdb6333147cb2ab30e0512452a70ac7c1de4ae62542e216751491384700380a737ce4823e8885f370e9a3b"

RPROVIDES:${PN} += "libnl-devel \
libnl3-devel \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-cli-3.0 \
pkgconfig-libnl-genl-3.0 \
pkgconfig-libnl-idiag-3.0 \
pkgconfig-libnl-nf-3.0 \
pkgconfig-libnl-route-3.0 \
pkgconfig-libnl-xfrm-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnl3-200 \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-genl-3.0 \
pkgconfig-libnl-nf-3.0 \
pkgconfig-libnl-route-3.0"

inherit rpm
