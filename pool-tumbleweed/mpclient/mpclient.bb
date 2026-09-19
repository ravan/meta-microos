SUMMARY = "A minimalist command line interface to MPD"
DESCRIPTION = "A client for MPD, the Music Player Daemon. mpc connects to a MPD \
running on a machine via a network. Accepts input on standard input, \
so can be easily used in scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.35"

RPM_NAME = "mpclient-0.35-2.3.aarch64.rpm"
RPM_HASH = "381b81d847015d00f56a1211c2004f9ce9e65a8bf529b87324a0065e75fc02be6027fc3ac1f62722ad06f9a1952f253a94b871e1e580e2d2d08878257da5fd76"

RPROVIDES:${PN} += "config-mpclient \
mpclient"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpdclient.so.2"

inherit rpm
