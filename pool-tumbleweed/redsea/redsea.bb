SUMMARY = "An RDS decoder"
DESCRIPTION = "redsea is a command-line RDS (Radio Data System) decoder. \
It can be used with any RTL-SDR USB radio stick with the rtl_fm tool. \
It can also decode the raw ASCII bitstream, the hex format used by RDS Spy, \
and audio files containing multiplex signals (MPX). \
 \
RDS groups are printed to the terminal as line-delimited JSON objects \
or, optionally, undecoded hex blocks (-x)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "redsea-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "0163ca1360641656384f699c76dc6314ba582dc96a0afab7fc0a1dc496fc466d4af93fb8e9f9821bd923ed8adaee1c0ebee70a5b962a42f0a395bce2aff2f9c6"

RPROVIDES:${PN} += "redsea"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libliquid.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
