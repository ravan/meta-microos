SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python314-azure-purview-administration-1.0.0b1-3.9.noarch.rpm"
RPM_HASH = "1e2860395cd39b5057ce4ae7e4035361039f09ba416c639b22c60da1d6f0b55d9cb6a6ca0d0711be2d5f3b484518f96fd67513d05768412bb8b641751ac60755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-administration \
python314-azure-purview-administration \
python3dist-azure-purview-administration"

RDEPENDS:${PN} += "-python314-azure-core >= 1.18.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-purview-nspkg \
python314-msrest \
python314-six"

inherit rpm
