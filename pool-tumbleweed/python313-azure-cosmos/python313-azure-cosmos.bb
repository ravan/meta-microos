SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.17.0"

RPM_NAME = "python313-azure-cosmos-4.17.0-1.1.noarch.rpm"
RPM_HASH = "8743a31751bb4f5a6b10db22fc35dd1cd876b0a38d61e82209723026aa10b483269f83adb2bef29e854f58ce860fbd7b4ca58d2dd2aaa6943865dab2e6fe7d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cosmos \
python3.13dist-azure-cosmos \
python313-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
