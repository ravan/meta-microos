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

RPM_NAME = "python314-azure-agrifood-farming-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "9186cb23e22564056e18d6839ce1631f0208160b64ce906bcc90faba1b5c83be149b85fe5e06f75f52ae1851313cfd3f94436fc880413a8177718e022baf07ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-agrifood-farming \
python314-azure-agrifood-farming \
python3dist-azure-agrifood-farming"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-agrifood-nspkg \
python314-azure-nspkg \
python314-msrest \
python314-six"

inherit rpm
