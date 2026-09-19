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
LICENSE = "BSD-3-Clause"

PV = "3.11"

RPM_NAME = "python313-ply-3.11-7.1.noarch.rpm"
RPM_HASH = "1755e62ac6b12c82bf184e6e70b8f77917c4ade762135c85b76796d5edf73ba448b0c65ba01d7132322a28d946e218f095075e8bc7f995de32761b49aef4c273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ply \
python3.13dist-ply \
python313-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
