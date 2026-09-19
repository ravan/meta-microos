SUMMARY = "Automated tests for bitcoin client"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides automated tests for bitcoin-qt6 and bitcoind."
LICENSE = "MIT"

PV = "31.1"

RPM_NAME = "bitcoin-test-31.1-1.1.aarch64.rpm"
RPM_HASH = "406c1e4158436eae3feb196f7a3fc43a35e09da435407fffc27375d6c8d0fb6998e27a763529143edeff5d83b6e37fac01526283b8a6f025d996c3a6b0b0f490"

RPROVIDES:${PN} += "bitcoin-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Test.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libqrencode.so.4 \
libsqlite3.so.0 \
libstdc++.so.6 \
libzmq.so.5"

inherit rpm
