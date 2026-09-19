SUMMARY = "Python Lex & Yacc"
DESCRIPTION = "PLY is yet another implementation of lex and yacc for Python. Some notable \
features include the fact that its implemented entirely in Python and it \
uses LALR(1) parsing which is efficient and well suited for larger grammars. \
 \
PLY provides most of the standard lex/yacc features including support for empty \
productions, precedence rules, error recovery, and support for ambiguous grammars. \
 \
PLY provides extensive error checking. \
It is compatible with both Python 2 and Python 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "python-ply-doc-3.11-7.1.noarch.rpm"
RPM_HASH = "e29a19245628340c171b52a777895fcefabfdd0578542d9534aef3f2bc723100a1b48091d97467847a894ac7b34a3f864b56a923fe4312efb86055b13113b627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ply-doc"

RDEPENDS:${PN} += ""

inherit rpm
