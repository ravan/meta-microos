SUMMARY = "Should style asserts"
DESCRIPTION = "PyShould is a Python DSL allowing to write expectations or assertions \
in almost natural language. The goal is to offer an expressive yet \
readable syntax to define the expectations in detail. \
 \
Under the hood it uses the PyHamcrest library of matchers to build \
complex matching predicates and great explanations when there is a \
mismatch. \
 \
Its primary use case is in unit testing, replacing the need for \
Python's native assertX methods. Its use is completely transparent \
to the unit testing runner used, since mismatches are reported using \
the standard AssertionError."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-pyshould-0.7.1-7.10.noarch.rpm"
RPM_HASH = "3f995760591d5059e7f4ff532b9741d73a56e45976dcb9e74546bc1ac0fb0dcac307c81c1d0debe33bcf49e892b1754dd159e518f2316796f24eb6aa075c67c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyshould \
python314-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python314-hamcrest"

inherit rpm
