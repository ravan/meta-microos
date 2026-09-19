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

RPM_NAME = "python314-ply-3.11-7.1.noarch.rpm"
RPM_HASH = "6bfec4402e15454dadc29b932929a94d271db9fbbc700a0a80ddb2d406c39a05907e2dcf66d21de182f8c67d4c474e4ebc037eab312e560fb212769c4ee4760f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ply \
python314-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
