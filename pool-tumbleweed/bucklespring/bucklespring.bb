SUMMARY = "Nostalgia keyboard sound emulator"
DESCRIPTION = "This project emulates the sound of an old faithful IBM Model-M space \
saver bucklespring keyboard while typing on a notebook/pc."
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "bucklespring-1.5.1-1.16.aarch64.rpm"
RPM_HASH = "93552780859b2c93bb25d25d5c6fa85d40c45fedc8e595a142bc7ac48deabebb22694a908bc0e0d758a93ace59ba9829fd4af2bec00f0bc9ef860df9196b2b0e"

RPROVIDES:${PN} += "bucklespring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libalure.so.1 \
libc.so.6 \
libopenal.so.1"

inherit rpm
