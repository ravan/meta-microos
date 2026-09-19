SUMMARY = "Microsoft Azure Purview Scanning Client Library for Python"
DESCRIPTION = "Azure Purview Scanning is a fully managed cloud service whose users can scan your \
data into your data estate (also known as your catalog). Scanning is a process by \
which the catalog connects directly to a data source on a user-specified schedule. \
 \
 * Scan your data into your catalog \
 * Examine your data \
 * Extract schemas from your data"
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-purview-scanning-1.0.0b2-3.9.noarch.rpm"
RPM_HASH = "8cf9b3235cdfcf5c34a6468159e85e2c94644a74ad907bc4bcf7b438c825c6b520c834ef3bbb2c07e9c84bedbc917cb2dd969848817c5c2f9fa2bda524764514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-scanning \
python3.13dist-azure-purview-scanning \
python313-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "-python313-azure-core >= 1.18.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-purview-nspkg \
python313-msrest \
python313-six"

inherit rpm
