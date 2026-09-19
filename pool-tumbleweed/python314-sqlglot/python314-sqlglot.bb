SUMMARY = "An easily customizable SQL parser and transpiler"
DESCRIPTION = "SQLGlot is a no dependency Python SQL parser, transpiler, and optimizer. It can be \
used to format SQL or translate between different dialects like DuckDB, Presto, \
Spark, Snowflake, and BigQuery. It aims to read a wide variety of SQL inputs and \
output syntactically correct SQL in the targeted dialects. \
 \
It is a very comprehensive generic SQL parser with a robust test suite. It is also \
quite performant while being written purely in Python. You can easily customize the \
parser, analyze queries, traverse expression trees, and programmatically build SQL. \
Syntax errors are highlighted and dialect incompatibilities can warn or raise \
depending on configurations."
LICENSE = "MIT"

PV = "30.3.0"

RPM_NAME = "python314-sqlglot-30.3.0-2.1.noarch.rpm"
RPM_HASH = "583e0113dc8c2a79d25bc06e6ecc8aa294f891dddd79068e696aa94c9a0c2dde7b4e3541d92f9d08dca023e0b396f4a58d2e1f890177e2344c3c9dc6a519f8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlglot \
python314-sqlglot \
python3dist-sqlglot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
