SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-synapse-nspkg-1.0.0-4.9.noarch.rpm"
RPM_HASH = "040a68d62ddba5332d1784679e620957ef08408d2627aed7a4e16f17b80191b395896e372c7df48aa641c2f2ef826c74a59db31867875084c0a57daca153dbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-nspkg \
python3.13dist-azure-synapse-nspkg \
python313-azure-synapse-nspkg \
python3dist-azure-synapse-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
