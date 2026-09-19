SUMMARY = "Amateur Multicast Protocol - file transfer program"
DESCRIPTION = "FLAMP is a program for AMP or Amateur Multicast Protocol. An FLAMP session will \
transmit one or more files with one or more iterations of the transmission. Each \
file is broken into blocks, each of which has a check sum. The receiving station \
saves the blocks that pass check sum. Successive transmissions will fill in the \
missing blocks provided that the new blocks pass the check sum. After the \
transmission sequence, the entire file is assembled and may be saved. “Fills” \
may be provided by retransmitting the entire file or by the sending station \
only sending the missing blocks."
LICENSE = "GPL-2.0"

PV = "2.2.14"

RPM_NAME = "flamp-2.2.14-1.6.aarch64.rpm"
RPM_HASH = "467030d5fa48a9ba5eb9559c224eef8c19a7be441637cf1f3c4537e8b623ab7bd98b11980a8327fa5a3ea1cc3d724c6dbf859c346f4dfd28556bee156f11cd30"

RPROVIDES:${PN} += "flamp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libflxmlrpc.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
