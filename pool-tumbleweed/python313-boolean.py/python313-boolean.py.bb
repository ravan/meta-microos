SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python313-boolean.py-5.0-1.4.noarch.rpm"
RPM_HASH = "fb43a9eca34506449d69de62e518640c7dc732d7aa7bca05a99a267a4becc5d975f4f9472fd9c860f8095ad8efea2cf67268f9c9466f4a347f7ecd48a2f3ebe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boolean.py \
python3.13dist-boolean.py \
python313-boolean.py \
python3dist-boolean.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
