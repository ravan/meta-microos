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

RPM_NAME = "python313-asteval-1.0.9-1.1.noarch.rpm"
RPM_HASH = "f6b0bd3bfe06be3677d812d57d2896a6743ac9e573b1ce849d61b9b334040c0f2c9f4f2305dbb801be2c5829587278a4eb9172245de5c945d95939b795db740a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asteval \
python3.13dist-asteval \
python313-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
