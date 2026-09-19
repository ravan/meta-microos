SUMMARY = "Microsoft Azure Purview Catalog Client Library for Python"
DESCRIPTION = "Azure Purview Catalog is a fully managed cloud service whose users can discover the \
data sources they need and understand the data sources they find. At the same time, \
Data Catalog helps organizations get more value from their existing investments. \
 \
 * Search for data using technical or business terms \
 * Browse associated technical, business, semantic, and operational metadata \
 * Identify the sensitivity level of data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python313-azure-purview-catalog-1.0.0b4-2.9.noarch.rpm"
RPM_HASH = "8107c74b31736f7a8220f570ab78ecfa8914d89302dec4c5170056069aced5717892703e35f3efdc13d5e5f2e16fa7fc9216b777890e99c5401f5552bf069ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-catalog \
python3.13dist-azure-purview-catalog \
python313-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "-python313-azure-core >= 1.23.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-purview-nspkg \
python313-msrest"

inherit rpm
