SUMMARY = "An end-user CLI for the Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides bitcoin-cli — a CLI tool to interact with the daemon."
LICENSE = "MIT"

PV = "31.1"

RPM_NAME = "bitcoin-utils-31.1-1.1.aarch64.rpm"
RPM_HASH = "4467e3634a6bffd63aee3776cf86581615e33a0aa72878a2375b57b2e8746b3eb76695fd4f82e92e3349604de5cb739b5adb6333514d28c462b31e60c616999d"

RPROVIDES:${PN} += "bitcoin-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
