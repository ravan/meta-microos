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

RPM_NAME = "python314-azure-purview-scanning-1.0.0b2-3.9.noarch.rpm"
RPM_HASH = "be1865d0f27fb3bf831d99f7554035e01dd4eeb481815f342ccc4e453b675f5a93142ecdfa41875135e03dd3aba0da25e36469ef69efc699da447a6662a19d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-scanning \
python314-azure-purview-scanning \
python3dist-azure-purview-scanning"

RDEPENDS:${PN} += "-python314-azure-core >= 1.18.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-purview-nspkg \
python314-msrest \
python314-six"

inherit rpm
