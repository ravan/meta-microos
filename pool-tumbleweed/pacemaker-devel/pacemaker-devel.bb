SUMMARY = "Pacemaker development package"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-devel package contains headers and shared libraries \
for developing tools for Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-devel-3.0.3+20260728.7052efa194-1.1.aarch64.rpm"
RPM_HASH = "4cb210b04383cc1eae5d0bb5f2c061d458e7c27ccf2389332783e4bc571930c8bb1c827a73bd1b927ea56e7ec190ff39696320cbfc08de161205aa73e289c8e1"

RPROVIDES:${PN} += "libpacemaker-devel \
pacemaker-devel \
pkgconfig-libpacemaker \
pkgconfig-pacemaker \
pkgconfig-pacemaker-cib \
pkgconfig-pacemaker-cluster \
pkgconfig-pacemaker-fencing \
pkgconfig-pacemaker-lrmd \
pkgconfig-pacemaker-pe-rules \
pkgconfig-pacemaker-pe-status \
pkgconfig-pacemaker-service"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtool-ltdl-devel \
pacemaker-libs \
pkgconfig \
pkgconfig-bzip2 \
pkgconfig-corosync \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gnutls \
pkgconfig-libcfg \
pkgconfig-libcmap \
pkgconfig-libcorosync-common \
pkgconfig-libcpg \
pkgconfig-libqb \
pkgconfig-libquorum \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pacemaker \
pkgconfig-pacemaker-cib \
pkgconfig-pacemaker-fencing \
pkgconfig-pacemaker-lrmd \
pkgconfig-pacemaker-pe-rules \
pkgconfig-pacemaker-pe-status \
pkgconfig-pacemaker-service \
pkgconfig-uuid"

inherit rpm
