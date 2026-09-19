SUMMARY = "PEG algorithm based parser generator"
DESCRIPTION = "Parsley is a parsing library. Most parser generators like ANTLR and \
Bison are based on LL or LR parsing algorithms that compile to big \
state machine tables, whereas Parsley, like pyparsing and \
ZestyParser, uses the PEG algorithm, so each expression in the \
grammar rules works like a Python expression. In particular, \
alternatives are evaluated in order, unlike table-driven parsers such \
as yacc, bison or PLY. \
 \
The binaries are prefixed with parsley-."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python314-Parsley-1.3-8.2.noarch.rpm"
RPM_HASH = "3f8bff52fd523aa03aefbc80da36e6f21b9e972c429e249d4aa775fa0228dad68ee0527790797e381c0cac712c078cae2d1e30bd00a4cf53c29e9764bddbd755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parsley \
python314-Parsley \
python314-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
