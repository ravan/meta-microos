SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-2.2.7-113.3.aarch64.rpm"
RPM_HASH = "9e930c343d1bcac203a334a89bbb2b5a48c5e84c642f0a11fd79f70b0d894b41502e9a0bca1a16efa4555c9334ccf0fe2b7d5da08d69deae47d7dd20970ad7f8"

RPROVIDES:${PN} += "libnjb"

RDEPENDS:${PN} += "dbus-1 \
libc.so.6 \
libnjb.so.5 \
libz.so.1"

inherit rpm
