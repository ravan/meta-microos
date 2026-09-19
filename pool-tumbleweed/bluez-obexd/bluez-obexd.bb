SUMMARY = "Object Exchange daemon for sharing binary objects"
DESCRIPTION = "This is an object exchange daemon for binary objects transferring between \
devices. obexd is necessary to install for sharing files, contacts \
etc. through bluetooth."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-obexd-5.82-2.4.aarch64.rpm"
RPM_HASH = "62fef5135fc0a314b45138a3d19ca05c109a994941201d3bf74a223c82f746881b0bf59547ea8961de3c722a09bdf8e8efc11cf58ac75fdfa81b121b26ec1a08"

RPROVIDES:${PN} += "bluez-obexd"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libicalvcal.so.3"

inherit rpm
