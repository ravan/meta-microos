SUMMARY = "Not Quite PTP"
DESCRIPTION = "nqptp is a daemon that monitors timing data from any PTP clocks – up to 64 – it \
sees on ports 319 and 320. It maintains records for each clock, identified by \
Clock ID and IP. \
 \
It is a companion application to Shairport Sync and provides timing information \
for AirPlay 2 operation."
LICENSE = "GPL-2.0-only"

PV = "1.2.8"

RPM_NAME = "nqptp-1.2.8-1.3.aarch64.rpm"
RPM_HASH = "cd3fe6e95db7c6cad42a4cfbbae6afb443559051d5c6c8e823feb56ccd984b1770dde5660bfa0df4387be391de9db5c71d0c62ef30812ca64e67e81d281a4ed1"

RPROVIDES:${PN} += "nqptp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
