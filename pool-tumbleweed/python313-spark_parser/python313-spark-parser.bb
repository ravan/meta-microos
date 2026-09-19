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

RPM_NAME = "python313-spark_parser-1.9.0-1.9.noarch.rpm"
RPM_HASH = "3e4ddaf7bcafee94ed044219ed389ad68f296fb1689b246135c0036deafddb9db8ae5f021c79c8dab8bdd0bb8e7aa1966fdd21b0d0b491f60ea4bf561604d4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spark-parser \
python3.13dist-spark-parser \
python313-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
update-alternatives"

inherit rpm
