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

RPM_NAME = "python313-pyshould-0.7.1-7.10.noarch.rpm"
RPM_HASH = "24c407bb689313905f3cac57b9deb8afc62b3546ce60115c79e854619a7573f4a476048c996f9750d72d20b4aded73f7252b676277d9dbaa3ea640a53a7a4810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshould \
python3.13dist-pyshould \
python313-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python313-hamcrest"

inherit rpm
