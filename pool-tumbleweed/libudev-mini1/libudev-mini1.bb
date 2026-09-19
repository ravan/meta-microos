SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "libudev-mini1-261.2-1.1.aarch64.rpm"
RPM_HASH = "bd6223a842111f61155b6673bc7aa604dd88c1a02a3cbf5906734d58a81b2a8feb84a55ead3fd0af1b238730af95c44ba5c28c12b3dbce812b67e9b26ac55642"

RPROVIDES:${PN} += "libudev-mini1 \
libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
this-is-only-for-build-envs"

inherit rpm
