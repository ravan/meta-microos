SUMMARY = "A terminal UI for tshark"
DESCRIPTION = "Termshark is a TUI for tshark inspired by Wireshark. It can read pcap files or \
sniff live network interfaces, filter pcaps or live captures using Wireshark's \
display filters, reassemble and inspect TCP and UDP flows, view network \
conversations by protocol, and copy ranges of packets to the clipboard from the \
terminal."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "termshark-2.4.0-1.17.aarch64.rpm"
RPM_HASH = "6d7a49824ef27e603b7e9afd9253cfacf00887bfbbe3d2d5d3cb374a7031f05d95d1aeefcaaeb2911bf075ff96c7b3717a2946c9065f70fd42872dd3bf717c22"

RPROVIDES:${PN} += "termshark"

RDEPENDS:${PN} += "libc.so.6 \
wireshark"

inherit rpm
