SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-azure-confidentialledger-1.1.1-2.9.noarch.rpm"
RPM_HASH = "4d860f19776fbcf47d5de7bed097944193c029959975e874eae5c4f10d9045efba5de5551bc6802c9ae9acfb0b3dd20b43c1ab7253cdcfd709f0843ab403ba7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-confidentialledger \
python3.13dist-azure-confidentialledger \
python313-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-cryptography"

inherit rpm
