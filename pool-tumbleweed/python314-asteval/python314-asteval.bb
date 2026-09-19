SUMMARY = "Safe, minimalistic evaluator of python expression using ast module"
DESCRIPTION = "ASTEVAL provides a numpy-aware, safe(ish) 'eval' function \
 \
Emphasis is on mathematical expressions, and so numpy ufuncs \
are used if available.  Symbols are held in the Interpreter \
symbol table 'symtable':  a simple dictionary supporting a \
simple, flat namespace. \
 \
Expressions can be compiled into ast node for later evaluation, \
using the values in the symbol table current at evaluation time."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python314-asteval-1.0.9-1.1.noarch.rpm"
RPM_HASH = "a5724bf92d4e3ac81044bf99f0b047a7e6b8f80b2874c2a98abe3a60e1beca13bd314c5dca9650fc7ee7ec13374c9a4375b8014d4cbaa9f3cee4e6e61d3dad35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asteval \
python314-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
