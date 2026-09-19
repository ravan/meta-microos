SUMMARY = "MPC (Musepack) input plugin for the C* Music Player"
DESCRIPTION = "This package provides MPC (Musepack) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-mpc-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "82113aa13abc4078b0cc2e6e5d92553d285f18499e58e4cdafdc85b95941f26dde95a392377ede8827e4bdc6348a35516046464699fcf11bc0f8d92b50aa034d"

RPROVIDES:${PN} += "cmus-plugin-mpc"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpcdec.so.5"

inherit rpm
