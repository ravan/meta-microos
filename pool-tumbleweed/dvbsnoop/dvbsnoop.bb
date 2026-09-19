SUMMARY = "DVB / MPEG stream analyzer program"
DESCRIPTION = "Its purpose is to debug, dump or view digital stream information (e.g. \
digital television broadcasts) send via satellite, cable or terrestrial. \
Streams can be SI, PES or TS. Basically you can describe dvbsnoop as a \
'swiss army knife' analyzing program for DVB, MHP, DSM-CC or MPEG - similar \
to TCP network sniffer programs like the old and famous snoop on Sun \
Solaris or tcpdump on Linux (which is in fact a kind of a clone of SunOS \
'snoop'). You may also analyze offline mpeg streams, e.g. stored on DVD or \
mpeg2 movie files."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.50"

RPM_NAME = "dvbsnoop-1.4.50-23.5.aarch64.rpm"
RPM_HASH = "e5ef67d2ebb1e208ebc9f73c54ff0f33db03d841875894ec8f21f0be95a03e216241e1113ac5d4561e332c0fb79231f40a1080008f5ab2663ee625495808c72b"

RPROVIDES:${PN} += "dvbsnoop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
