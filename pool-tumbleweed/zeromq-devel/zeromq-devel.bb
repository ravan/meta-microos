SUMMARY = "Development files for ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package holds the development files for ZeroMQ."
LICENSE = "MPL-2.0"

PV = "4.3.5"

RPM_NAME = "zeromq-devel-4.3.5-1.12.aarch64.rpm"
RPM_HASH = "d64f185f6d951a347431cd1c63b1e6f3eb157315f4435141cf46bce7734535745b25142bee0399a16e86bcf64fbc663cae6f41dadcaa51752024f8195e353a5a"

RPROVIDES:${PN} += "libzmq-devel \
pkgconfig-libzmq \
zeromq-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzmq5 \
pkgconfig-libsodium \
pkgconfig-libunwind"

inherit rpm
