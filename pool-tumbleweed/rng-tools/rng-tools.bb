SUMMARY = "Support daemon for hardware random device"
DESCRIPTION = "This  daemon  feeds data from a random number generator to the kernel's \
random  number  entropy  pool,  after	first checking the data to \
ensure that it is properly random."
LICENSE = "GPL-3.0-or-later"

PV = "6.17"

RPM_NAME = "rng-tools-6.17-5.5.aarch64.rpm"
RPM_HASH = "590a2aba569ff1a111e017df00e3b2b0e3f501425687eb04004742415910e6e23380f0c5e9aa1bedc37240385bd6dd7c41620bf95971bcc4487906fe29877c1d"

RPROVIDES:${PN} += "rng-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libjitterentropy.so.3 \
libp11.so.3 \
opensc \
systemd"

inherit rpm
