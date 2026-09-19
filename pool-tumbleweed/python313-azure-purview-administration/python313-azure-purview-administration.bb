SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python313-azure-purview-administration-1.0.0b1-3.9.noarch.rpm"
RPM_HASH = "c7282a5b35d3077c1e8d7abf252f66815e52c8e43c7c6cb92b2f6ac9c3881b0ca2df48a913c2fba4bdcbd997114a90139a05cad6fe3e44dd320575e7ea3e0756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-administration \
python3.13dist-azure-purview-administration \
python313-azure-purview-administration \
python3dist-azure-purview-administration"

RDEPENDS:${PN} += "-python313-azure-core >= 1.18.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-purview-nspkg \
python313-msrest \
python313-six"

inherit rpm
