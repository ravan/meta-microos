SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python314-boolean.py-5.0-1.4.noarch.rpm"
RPM_HASH = "2b19e0f123a152e789017074a185aff5890b53525f165c4be374de7acede2d12867ded01a249f94ecbcf770456c2c1a1cfd7de9f11d5fb49220f36584877970d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-boolean.py \
python314-boolean.py \
python3dist-boolean.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
