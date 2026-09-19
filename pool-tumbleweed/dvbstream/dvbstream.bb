SUMMARY = "Broadcasts a DVB Stream over the Network"
DESCRIPTION = "dvbstream can broadcast either a (subset of a) DVB transport stream or \
a DVB program stream over a LAN using the rtp protocol. It attempts to \
be compliant with RFCs 1889, 1890, 2038, and 2250. It can also dump the \
stream to stdout, for example, for local software decoding when using \
DVB cards without a hardware MPEG decoder."
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "dvbstream-0.6-164.9.aarch64.rpm"
RPM_HASH = "902dfae8130c498a980682687787c3bbfae17f144605c93c162188c299f523b284ceff2ee0e3ee9dd596cbf30206406ca8f873c42408ce0e64290534612ca986"

RPROVIDES:${PN} += "dvbstream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
