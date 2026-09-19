SUMMARY = "Framework to integrate services and actions - core library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the core library files of the package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Purpose6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e3e63040a323a40fe3af23b2f501c0735a07abd55ff802f9a7aff79cda9312905a4c68c91cc98b6b95bd1481ddf6098704fff873db93dace4bf38a712a5d2f30"

RPROVIDES:${PN} += "libKF6Purpose.so.6 \
libKF6Purpose6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-purpose \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
