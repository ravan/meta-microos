SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python314-babelfish-0.6.1-2.5.noarch.rpm"
RPM_HASH = "2653846a5f62d3144b3568a26f289b3b401c7f8905cee57439011eac08f66805c66e4720af2dcfc2cc0f458e5ef972e7c644d4c22f1c7d54954dfa63cd1df180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-babelfish \
python314-babelfish \
python3dist-babelfish"

RDEPENDS:${PN} += "python-abi"

inherit rpm
