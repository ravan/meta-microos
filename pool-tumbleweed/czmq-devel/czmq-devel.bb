SUMMARY = "Devel files for czmq"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
 \
This subpackage contains libraries, header files, and pkgconfig and \
cmake descriptions for developing applications that want to make use \
of CZMQ."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-devel-4.2.1-1.20.aarch64.rpm"
RPM_HASH = "205ec11a97497004a5266a3e91e89b2c1c96e4afa9b32d867bbadc44534e0c06ab67b639ea2375a41116394125306e948436d554c6330ae58b10f7d2a707a1ef"

RPROVIDES:${PN} += "czmq-devel \
pkgconfig-libczmq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libczmq4 \
pkgconfig-libcurl \
pkgconfig-liblz4 \
pkgconfig-libmicrohttpd \
pkgconfig-libsystemd \
pkgconfig-libzmq \
pkgconfig-nss \
pkgconfig-uuid \
systemd-devel"

inherit rpm
