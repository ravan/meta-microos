SUMMARY = "A simple program to tunnel/sniff between 2 serial ports"
DESCRIPTION = "This program was written to aid with the decoding of the protocol \
used by serial communication. It has support for sniffing a TCP \
connection or between a serial port and a TCP port."
LICENSE = "GPL-2.0-only"

PV = "0.0.5"

RPM_NAME = "sersniff-0.0.5-1.22.aarch64.rpm"
RPM_HASH = "92ae085ffb3f40bd6cbb8b43d3f5a63dc60c3ccad53f228886ca16e29f1e3004a46c915fffd2f0c17e72ae5e0509a7de4409b582e52bf18a717855105cd722ff"

RPROVIDES:${PN} += "sersniff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
