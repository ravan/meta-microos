SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "2.1.5"

RPM_NAME = "syncthing-relaysrv-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "bd6f3cc58ca3cf1bacccfa463cf7d10e1878e71a027a9593b353a7abc7f2a6f15246dd74cb82350c9d3f90f49469e5bc672e9bb24d2093fabcbe4e29ff03771d"

RPROVIDES:${PN} += "group-strelaysrv \
syncthing-relaysrv \
user-strelaysrv"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
shadow \
sysuser-shadow"

inherit rpm
