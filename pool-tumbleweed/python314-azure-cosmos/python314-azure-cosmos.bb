SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.17.0"

RPM_NAME = "python314-azure-cosmos-4.17.0-1.1.noarch.rpm"
RPM_HASH = "c30f3a29813e4efaf3fb71d9623d6aa7e12b110ab69a40bd76fcdff4a1abe5ed63ab9e1b9a063c9c669982e320e98275e0c461a22a8dd057365fd34f841c80b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cosmos \
python314-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
