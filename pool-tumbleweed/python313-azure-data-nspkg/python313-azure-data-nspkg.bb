SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-data-nspkg-1.0.0-4.9.noarch.rpm"
RPM_HASH = "62d15978e6ba9242666ea26ed0fddcc5f219bb84d21632d069aecb89745f45aa89d7d39377aee3c0b358b9788301594aae9a5d12dae346eb77db73d31e921c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-nspkg \
python3.13dist-azure-data-nspkg \
python313-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
