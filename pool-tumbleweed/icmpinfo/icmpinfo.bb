SUMMARY = "A Tool for Looking at ICMP Messages"
DESCRIPTION = "A tool for looking at the ICMP messages received on the running host."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "icmpinfo-1.11-717.6.aarch64.rpm"
RPM_HASH = "9aac2ee99d619a17fa1a6fd735ebe8fd0d7036ac2a8e3aa6da2d18adc397e41faffecbc5e02fa1979b0a13f6f6e5b4ac678e6f38f399097270eba42ec642c86e"

RPROVIDES:${PN} += "icmpinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
netcfg"

inherit rpm
