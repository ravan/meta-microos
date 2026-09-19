SUMMARY = "Functions to control oepration of a CD-ROM while playing audio CDs"
DESCRIPTION = "libcdaudio is a library providing functions to control \
operation of a CD-ROM when playing audio CDs.  It also contains \
functions for CDDB and CD index lookup."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.12p2"

RPM_NAME = "libcdaudio1-0.99.12p2-2.18.aarch64.rpm"
RPM_HASH = "1f997ac8dae998ab0384d4def8f219ffc768c4623b6fb7d60ffa4a4df7d7efc99c6eb4bb4bad48538a3b25e9739340028fbad216eebc83d5dfb9574df73fe356"

RPROVIDES:${PN} += "libcdaudio \
libcdaudio.so.1 \
libcdaudio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
