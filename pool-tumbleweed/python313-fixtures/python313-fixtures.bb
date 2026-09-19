SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python313-fixtures-4.3.2-1.3.noarch.rpm"
RPM_HASH = "0782dc68122638641223f6832f3bba4864f4e84ba7f85639f0e0e31e30f1268708766850c9d8ca1edabf9743c673fe1cbc0e3b2cbd841aff2f5a08fd045cbee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fixtures \
python3.13dist-fixtures \
python313-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python313-testtools"

inherit rpm
