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

RPM_NAME = "python313-dpcontracts-0.6.0-4.5.noarch.rpm"
RPM_HASH = "894f0cf022c64bca8f7d70df743e90718d48c935ebbd3772824ea13c6a649603c5397479f606e37b31f1364baddcc86c499feccd5c8b2636dd86437d4c8c51b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpcontracts \
python3.13dist-dpcontracts \
python313-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
