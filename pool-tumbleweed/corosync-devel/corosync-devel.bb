SUMMARY = "The Corosync Cluster Engine Development Kit"
DESCRIPTION = "This package contains include files and man pages used to develop using \
The Corosync Cluster Engine APIs."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "corosync-devel-3.1.10-5.1.aarch64.rpm"
RPM_HASH = "dc65d18ba5c91c1185806e66452a32047524b24d4a0da14f4981c51fe1320af9a09267826446c300ab20d50be2b746ba2e8fea3c0aff3053b42c08e650a938b7"

RPROVIDES:${PN} += "corosync-devel \
pkgconfig-corosync \
pkgconfig-libcfg \
pkgconfig-libcmap \
pkgconfig-libcorosync-common \
pkgconfig-libcpg \
pkgconfig-libquorum \
pkgconfig-libsam \
pkgconfig-libvotequorum"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
corosync-libs \
pkgconfig \
pkgconfig-libqb"

inherit rpm
