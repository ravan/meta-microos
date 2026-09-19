SUMMARY = "A SQL query builder API for Python"
DESCRIPTION = "A SQL query builder API for Python. The motivation behind PyPika is to provide a simple interface for building SQL queries without limiting the flexibility of handwritten SQL. Designed with data analysis in mind, PyPika leverages the builder design pattern to construct queries to avoid messy string formatting and concatenation. It is also easily extended to take full advantage of specific features of SQL database vendors."
LICENSE = "Apache-2.0"

PV = "0.51.1"

RPM_NAME = "python314-PyPika-0.51.1-1.3.noarch.rpm"
RPM_HASH = "d7229ec983a42adb363a78d17226c88d3d4c007e754e6a160798cd8fc2d35fd3ef0c61f0a274debfed15d7543ca3d7bab7d563ce22701fa0f1a8018ebf6c18cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypika \
python314-PyPika \
python3dist-pypika"

RDEPENDS:${PN} += "python-abi"

inherit rpm
