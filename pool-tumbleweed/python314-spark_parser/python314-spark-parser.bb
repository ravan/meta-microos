SUMMARY = "An Earley-Algorithm Context-free grammar Parser Toolkit"
DESCRIPTION = "SPARK stands for Scanning, Parsing, and Rewriting Kit. It uses Jay \
Earley's algorithm for parsing context-free grammars, and comes with \
some generic Abstract Syntax Tree routines. There is also a prototype \
scanner which does its job by combining Python regular expressions. \
 \
Please Note: Earley algorithm parsers are almost linear when given an LR \
grammar. These are grammars which are left-recursive."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python314-spark_parser-1.9.0-1.9.noarch.rpm"
RPM_HASH = "8c34598c91ff79a456c329793a19ff74eed2888e69757924ce1495f5352cb10f1271a0fc97d8aa0be271bd876c3d384d98f219d707cc21d0cb9b2b58b0af07ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spark-parser \
python314-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
update-alternatives"

inherit rpm
