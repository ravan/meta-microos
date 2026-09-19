SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.3.2"

RPM_NAME = "python314-pyparsing-3.3.2-1.4.noarch.rpm"
RPM_HASH = "06b7e5dd0305566194ed70919ccf4c6109e765b79d646e8de475512b8697d9c326ecb4576cd848fabf86117335aaa2d8bfc5bdf2fd02ee86aa6ec6edeb06a01b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyparsing \
python314-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
