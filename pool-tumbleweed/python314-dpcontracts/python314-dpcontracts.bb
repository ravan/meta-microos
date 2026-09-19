SUMMARY = "An implementation of contracts for Python"
DESCRIPTION = "This module provides a collection of decorators for \
writing software using contracts. \
 \
Contracts are a debugging and verification tool.  They are declarative \
statements about what states a program must be in to be considered \
'correct' at runtime.  They are similar to assertions, and are verified \
automatically at various well-defined points in the program.  Contracts can \
be specified on functions and on classes."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "python314-dpcontracts-0.6.0-4.5.noarch.rpm"
RPM_HASH = "c99b96044e9d74e960f12cf31053514233312b1df22f77935d68b4b904535ddadb4ce02cf3d4a5e99d4f070d6f2ad751724ab8a122f2f7f576c215fbd84b923f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dpcontracts \
python314-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
