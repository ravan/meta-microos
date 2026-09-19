SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python313-funcy-2.0-3.5.noarch.rpm"
RPM_HASH = "ec50a9489e1cc41b5b97aa2ec8b26c18d879d0ba6369390a9ddd2924530f237dc78d7d215cdb3e3a4a4640a75bfc8346b83116330debf20425d3de43d8885b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcy \
python3.13dist-funcy \
python313-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
