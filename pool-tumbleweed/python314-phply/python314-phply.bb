SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python314-phply-1.2.6-3.5.noarch.rpm"
RPM_HASH = "d1005a4e7a106ca66f25f14e66271a8cf9b30eeda9c2819459f1f507599a340b2c76181ce3b29d8522e4eb0db4983624a051db8410a928fd5df01bbba8ac555c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-phply \
python314-phply \
python3dist-phply"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-ply"

inherit rpm
