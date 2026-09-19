SUMMARY = "DDS2 Tape Streamer Utilities"
DESCRIPTION = "A tool for quick extraction of individual files from a DDS2 streamer. \
dds2tar can control data compression for HP DAT streamers."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "dds2tar-2.5.2-1333.11.aarch64.rpm"
RPM_HASH = "9acac70f49b79255230a3233d3ce2bf85d5c0e4e4f145e3cc08177ec92a5d0d7028d889ce06cadd7f3c73308662ec7f9e7423f7204f3e06a66be5155ac784827"

RPROVIDES:${PN} += "dds2tar"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
