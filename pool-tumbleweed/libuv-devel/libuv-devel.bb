SUMMARY = "Development libraries for libuv"
DESCRIPTION = "Development files for libuv. \
 \
libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.52.0"

RPM_NAME = "libuv-devel-1.52.0-1.3.aarch64.rpm"
RPM_HASH = "3094b5c8581126654d63df9b2ff310942476f2c2328aa84b83f8aded26d856f218f95f5bcbb16e7f2d8ff68415612d56dd6326e3a3e68920c736f5f93df87e13"

RPROVIDES:${PN} += "libuv-devel \
pkgconfig-libuv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuv1"

inherit rpm
