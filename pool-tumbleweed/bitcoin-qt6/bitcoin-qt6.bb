SUMMARY = "An end-user Qt6 GUI for the Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides Bitcoin-Qt, a GUI for Bitcoin based on \
Qt."
LICENSE = "MIT"

PV = "31.1"

RPM_NAME = "bitcoin-qt6-31.1-1.1.aarch64.rpm"
RPM_HASH = "54ea3b6e78710346cb288d58ad4f877bd62b2d8ed4a690369abc20d4ff44b8c7fef7688dd73f990a1e62f896511d2868227fcceb27cc1beb90de193b2e15e255"

RPROVIDES:${PN} += "bitcoin-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
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
