SUMMARY = "IPFS implementation in Go"
DESCRIPTION = "IPFS is a global, versioned, peer-to-peer filesystem. \
It combines good ideas from Git, BitTorrent, Kademlia, SFS, and the Web. \
It is like a single bittorrent swarm, exchanging git objects. \
IPFS provides an interface as simple as the HTTP web, but with permanence built in. \
You can also mount the world at /ipfs."
LICENSE = "MIT"

PV = "0.40.1"

RPM_NAME = "kubo-0.40.1-1.4.aarch64.rpm"
RPM_HASH = "4666ae39b85296134743c97d8b90b9818ae735308f6f26003b771fbc0ddb10d78e4abaf09ff128746a18c16693449263ed82a259a61124d7461bc782f6bb90e0"

RPROVIDES:${PN} += "go-ipfs \
ipfs \
kubo"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse \
libc.so.6 \
nss-myhostname \
systemd"

inherit rpm
