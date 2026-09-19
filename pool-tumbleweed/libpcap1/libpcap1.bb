SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libpcap1-1.10.7-1.1.aarch64.rpm"
RPM_HASH = "ee52ee1616a2c75f5f1624e7916669c820ca3d617ae6eb309e6472b8b1849b20cc66517018ae41cfda39e8859ff0f80101335e8d00232ca1764d18c00e1e9312"

RPROVIDES:${PN} += "libpcap \
libpcap.so.1 \
libpcap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
