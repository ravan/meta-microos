SUMMARY = "Utils for the Monero crypto-currency"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
This package provides Monero-CLI, a command line interface for Monero."
LICENSE = "MIT"

PV = "0.18.5.1"

RPM_NAME = "monero-utils-0.18.5.1-1.2.aarch64.rpm"
RPM_HASH = "1225b51cf2d19d9b40bf731bbfc221dc7360a0dabe6357d6159f4f07dba12a3a068a3bc4c037df1a8eb8d162da2585aa50d39a24010d52da8edcd5bba735d6e1"

RPROVIDES:${PN} += "monero-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libunbound.so.8"

inherit rpm
