SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-purview-nspkg-2.0.0-3.9.noarch.rpm"
RPM_HASH = "04867b01879011d7bc36c457386437c4ddc9f309a1feed7e4491e26e9e7c105529a4165756310c82422a26234ac972d84729a28e5b43a35172f8d5516f1a653a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-nspkg \
python3.13dist-azure-purview-nspkg \
python313-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
