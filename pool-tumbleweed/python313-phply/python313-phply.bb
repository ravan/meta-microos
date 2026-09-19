SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python313-phply-1.2.6-3.5.noarch.rpm"
RPM_HASH = "bdcda3bc03adcd6d0db000d49d6a84ec6517b2192e134a69d883de9cd007cacbb1aaaa3dc33ce5e847df29d6a69cdf93c38deb8e37c51c1a02ae65356c4132e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phply \
python3.13dist-phply \
python313-phply \
python3dist-phply"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-ply"

inherit rpm
