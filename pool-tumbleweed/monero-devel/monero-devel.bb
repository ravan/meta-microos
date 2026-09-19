SUMMARY = "Development files for monero"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
The monero-devel package contains libraries and header files for developing applications that use monero."
LICENSE = "MIT"

PV = "0.18.5.1"

RPM_NAME = "monero-devel-0.18.5.1-1.2.aarch64.rpm"
RPM_HASH = "b9dc29fa7cf62154203373b627571479a4e8cc3b8611eb48c0ab8536931f2f184c33ced0cf7a182c487e18f976c0e97b4187e1181ae96a6370c531dbd89bbd02"

RPROVIDES:${PN} += "monero-devel"

RDEPENDS:${PN} += ""

inherit rpm
