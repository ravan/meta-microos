SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-synapse-nspkg-1.0.0-4.9.noarch.rpm"
RPM_HASH = "a7d2d31dcfabd7e293bdf0837e0815f674413c57e6fe7868e6a32d965871c0ac75bf06b3df93849a2e58b5cee73c9309f098465eb9da49d4b771b569bf16d161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-nspkg \
python314-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
