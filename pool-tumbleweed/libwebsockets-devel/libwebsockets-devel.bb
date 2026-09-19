SUMMARY = "Development files for libwebsockets"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the WebSockets library."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets-devel-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "5d0b8ca52d3e2a512386782e9452e928dfe7c7e8c168e04fa71c2a439a589f0cff5ef060212a0e052e43bb8cb2ee6820eda120045184acf933f92e508e274764"

RPROVIDES:${PN} += "cmake-libwebsockets \
libwebsockets-devel \
pkgconfig-libwebsockets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebsockets-evlib-ev \
libwebsockets-evlib-event \
libwebsockets-evlib-glib \
libwebsockets-evlib-uv \
libwebsockets22 \
pkgconfig-dbus-1 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-sqlite3"

inherit rpm
