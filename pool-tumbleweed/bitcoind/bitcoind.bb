SUMMARY = "Headless daemon for Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides bitcoind, headless bitcoin daemon."
LICENSE = "MIT"

PV = "31.1"

RPM_NAME = "bitcoind-31.1-1.1.aarch64.rpm"
RPM_HASH = "73bbed88f21e828c35ea264c18dd49fc7c01197e475a1734a057890eb566cf40cefe8af86e3124b93bafe1cddeb1413f2dda273e6184a2b3b8da8bb420da70ab"

RPROVIDES:${PN} += "bitcoind \
config-bitcoind \
group-bitcoin \
user-bitcoin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libzmq.so.5"

inherit rpm
