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

RPM_NAME = "python313-sqlglot-30.3.0-2.1.noarch.rpm"
RPM_HASH = "2121e7c76c617d3c5a2ad91e23c52c9afb66533c5e70e9a062ba878316a320cd9bde784d5cfe18ce9eb8d3b80db55e71ef94f0455175435c23c638e29c425026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlglot \
python3.13dist-sqlglot \
python313-sqlglot \
python3dist-sqlglot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
