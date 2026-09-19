SUMMARY = "Development files for lxqt-globalkeys"
DESCRIPTION = "Development files for lxqt-globalkeys including headers and libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-globalkeys-devel-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "748f6afa6a391307a886a160d3e3ac69d44a3cb14ace301b691c48c31809ddbc02b0583aa197fb14372ca1075461b5b115266716d72fec52fa75d82658ba7f3b"

RPROVIDES:${PN} += "cmake-lxqt-globalkeys \
cmake-lxqt-globalkeys-ui \
lxqt-globalkeys-devel \
pkgconfig-lxqt-globalkeys \
pkgconfig-lxqt-globalkeys-ui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt-globalkeys-ui2 \
liblxqt-globalkeys2 \
lxqt-globalkeys \
pkgconfig \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Widgets \
pkgconfig-lxqt-globalkeys"

inherit rpm
