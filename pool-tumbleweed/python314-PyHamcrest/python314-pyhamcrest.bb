SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python314-PyHamcrest-2.1.0-2.5.noarch.rpm"
RPM_HASH = "776644d1698b6b94c4f19bc0d8d706b181eb668c6a6ce9f1be49269f9eca5ac5851745412518d9ff6ab9b97a01003db5a583b916b9f3d70e7717e1bb67854de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhamcrest \
python314-PyHamcrest \
python314-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
