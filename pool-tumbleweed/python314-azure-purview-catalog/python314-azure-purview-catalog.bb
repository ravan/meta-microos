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

RPM_NAME = "python314-azure-purview-catalog-1.0.0b4-2.9.noarch.rpm"
RPM_HASH = "19ff99194c88522403ada980a0b102cd37ba9fd137a0f611aef88da660f282b36d1f187d6bee3f901e549890806f87fd4e645e12103950c29f17e2db9c5fbad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-catalog \
python314-azure-purview-catalog \
python3dist-azure-purview-catalog"

RDEPENDS:${PN} += "-python314-azure-core >= 1.23.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-purview-nspkg \
python314-msrest"

inherit rpm
