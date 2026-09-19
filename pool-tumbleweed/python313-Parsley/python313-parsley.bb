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

RPM_NAME = "python313-Parsley-1.3-8.2.noarch.rpm"
RPM_HASH = "16984b48c46fae3bb2bfd8b29efcf91c90078ed30298e425e73e9792b9f41026b53aade3fc42265c82032cae2cc30f52247997186ac34d9793ba2c120168bc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Parsley \
python3-parsley \
python3.13dist-parsley \
python313-Parsley \
python313-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
