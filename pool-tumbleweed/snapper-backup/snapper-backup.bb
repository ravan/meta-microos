SUMMARY = "A backup program for snapper"
DESCRIPTION = "A backup program for snapshots created by snapper."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "snapper-backup-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "42f8f0b53bf5b3c5e364769001c1a8fa302711eff1cfa49d742062458486d2ea107408ef95fabef6774116c1577c7c38f0201e181d21bb2fc0d051782687f46c"

RPROVIDES:${PN} += "snapper-backup"

RDEPENDS:${PN} += "/usr/bin/sh \
jq \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsnapper.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
snapper"

inherit rpm
