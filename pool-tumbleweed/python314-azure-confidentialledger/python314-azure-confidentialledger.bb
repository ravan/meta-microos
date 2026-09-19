SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-azure-confidentialledger-1.1.1-2.9.noarch.rpm"
RPM_HASH = "7764e105baac3b8249edb94c34a2c35b87288f634b0b23ea3135ec19809665a70c74dde0b71fb19f5c59888bae53aceb60c550e085c9182920d7821dd7254c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-confidentialledger \
python314-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-cryptography"

inherit rpm
