SUMMARY = "XDP helper library"
DESCRIPTION = "The libxdp package contains the libxdp library for managing XDP programs, \
used by the xdp-tools package"
LICENSE = "GPL-2.0-only"

PV = "1.6.3"

RPM_NAME = "libxdp1-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "ecfcc078c586e890aad1252347f43f44dc583b172bcb7f97af57dc5071e7ea7e6716ca80961f01c46bd51b331f7de543b00cbfa2fae303fb007cd4f6cfba76ad"

RPROVIDES:${PN} += "libxdp.so.1 \
libxdp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6"

inherit rpm
