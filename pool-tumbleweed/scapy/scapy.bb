SUMMARY = "Interactive Packet Manipulation Tool"
DESCRIPTION = "Scapy is a powerful interactive packet manipulation tool, packet generator, \
network scanner, network discovery tool, and packet sniffer. It provides \
classes to interactively create packets or sets of packets, manipulate them, \
send them over the wire, sniff other packets from the wire, match answers and \
replies, and more. Interaction is provided by the Python interpreter, so Python \
programming structures can be used (such as variables, loops, and functions). \
Report modules are possible and easy to make. It is intended to do about the \
same things as ttlscan, nmap, hping, queso, p0f, xprobe, arping, arp-sk, \
arpspoof, firewalk, irpas, tethereal, tcpdump, etc."
LICENSE = "GPL-2.0-only"

PV = "2.7.0"

RPM_NAME = "scapy-2.7.0-1.2.noarch.rpm"
RPM_HASH = "c7efeea4d8930c5791735e6131fec7fa8e54eeaf8ade7d1d7ac112f94935b7631bafdeb471f2ff39351758aed502c5f7f15b5bd00c6ea5ef3f618e694d6d7578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-scapy \
python3.13dist-scapy \
python3dist-scapy \
scapy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-cryptography"

inherit rpm
