SUMMARY = "Headless daemon for monero crypto-currency"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
This package provides monerod, a headless monero daemon."
LICENSE = "MIT"

PV = "0.18.5.1"

RPM_NAME = "monerod-0.18.5.1-1.2.aarch64.rpm"
RPM_HASH = "fe053540f3bb738746db6fa8fff5b66cc953547728a390024e707d8382524e95efcd41ad04e1d006601b9336e91bbeae5c86a3f0192ac597009e2adc5768b093"

RPROVIDES:${PN} += "config-monerod \
group-monero \
monerod \
user-monero"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libm.so.6 \
libreadline.so.8 \
libsodium.so.26 \
libssl.so.3 \
libstdc++.so.6 \
libunbound.so.8 \
libzmq.so.5"

inherit rpm
