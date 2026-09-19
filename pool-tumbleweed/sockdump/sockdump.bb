SUMMARY = "Dump UNIX domain socket traffic with eBPF"
DESCRIPTION = "sockdump passively monitors UNIX domain sockets using BPF and dumps any traffic \
as plain-text or in pcap format."
LICENSE = "Unlicense"

PV = "20231211"

RPM_NAME = "sockdump-20231211-1.9.noarch.rpm"
RPM_HASH = "2442eff62a5ab9faac8f77228fe164c4bbf9916cf8ebdd8e05829c59c4ff40f9d62723a701791f01699e6c8a8d09ebe9f3b84e3aaa173a1835d19508317d7271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sockdump"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-bcc"

inherit rpm
