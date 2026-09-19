SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kservice-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "eb0bd75e97638f180c22f897973550ece772d40c857480359a80dd5fb9cad2c4772649e0b2a4c1045bbd668abcbe0bc9e59c2e791fed26638c1ed3e8537f0872"

RPROVIDES:${PN} += "cmake-KF6Service \
kf6-kservice-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6CoreAddons \
libKF6Service6"

inherit rpm
