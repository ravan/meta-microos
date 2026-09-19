SUMMARY = "Microsoft Azure AgriFood Farming client library"
DESCRIPTION = "FarmBeats is a B2B PaaS offering from Microsoft that makes it easy for AgriFood companies \
to build intelligent digital agriculture solutions on Azure. FarmBeats allows users to \
acquire, aggregate, and process agricultural data from various sources (farm equipment, \
weather, satellite) without the need to invest in deep data engineering resources. Customers \
can build SaaS solutions on top of FarmBeats and leverage first class support for model \
building to generate insights at scale. \
 \
Use FarmBeats client library for Python to do the following. \
 \
 * Create & update farmers, farms, fields, seasonal fields and boundaries. \
 * Ingest satellite and weather data for areas of interest. \
 * Ingest farm operations data covering tilling, planting, harvesting \
   and application of farm inputs."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-agrifood-farming-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "4a069c345c8be3b90cddb626d5a7f913271a9146690c8e1c7be44e4470839089abbc0d77e3497d05c76c2e989dd19a9f3e1975143493fc1ec14cc0a76babfee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-agrifood-farming \
python3.13dist-azure-agrifood-farming \
python313-azure-agrifood-farming \
python3dist-azure-agrifood-farming"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-agrifood-nspkg \
python313-azure-nspkg \
python313-msrest \
python313-six"

inherit rpm
