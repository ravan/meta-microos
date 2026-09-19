SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "python313-sympy-1.14.0-1.1.noarch.rpm"
RPM_HASH = "eccb13fded075bdff60f74619819e8b583fed6ffef6a34f4a9defa0030362e52cf72b2fb2fb659857e9da3e34ba2e720c1f26540bebfb0d1daac6c7b55c67a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sympy \
python3.13dist-sympy \
python313-sympy \
python3dist-sympy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-mpmath \
update-alternatives"

inherit rpm
