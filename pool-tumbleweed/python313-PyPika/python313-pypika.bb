SUMMARY = "A SQL query builder API for Python"
DESCRIPTION = "A SQL query builder API for Python. The motivation behind PyPika is to provide a simple interface for building SQL queries without limiting the flexibility of handwritten SQL. Designed with data analysis in mind, PyPika leverages the builder design pattern to construct queries to avoid messy string formatting and concatenation. It is also easily extended to take full advantage of specific features of SQL database vendors."
LICENSE = "Apache-2.0"

PV = "0.51.1"

RPM_NAME = "python313-PyPika-0.51.1-1.3.noarch.rpm"
RPM_HASH = "835b7a3f121c86f712f6a52398a3ed5eb56432493fa053a5b8d5aaf6385d6b83ac59cdbde7c67c68735ab63b6d51b92b9834a63892decc200fa274c02a864da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPika \
python3.13dist-pypika \
python313-PyPika \
python3dist-pypika"

RDEPENDS:${PN} += "python-abi"

inherit rpm
