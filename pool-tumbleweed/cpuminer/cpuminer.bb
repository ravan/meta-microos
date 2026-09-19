SUMMARY = "A multi-threaded CPU Bitcoin and Litecoin miner"
DESCRIPTION = "An assembly optimized CPU miner for the Bitcoin and Litecoin cryptocurrencies, based on Jeff Garzik's reference cpuminer."
LICENSE = "GPL-2.0-only"

PV = "2.5.1"

RPM_NAME = "cpuminer-2.5.1-1.19.aarch64.rpm"
RPM_HASH = "4533cbd08c9d5a08aaf3384c41955321f9a12c1af6373db8b71bf77ee415a664a110b454bf9e52c572e0e4c6fb72989e8813a2d2a8b40cc6758e00d1ad2fb375"

RPROVIDES:${PN} += "cpuminer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4"

inherit rpm
