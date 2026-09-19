SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "python314-sympy-1.14.0-1.1.noarch.rpm"
RPM_HASH = "1a25eb6f2871d9f70ff71614d345d325d5b524170d2fe00b07f0e123617b2a7f276cb144e908e8fc9125eaf749fc5018215e9847de5555aaf7600a9f92e42721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sympy \
python314-sympy \
python3dist-sympy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-mpmath \
update-alternatives"

inherit rpm
