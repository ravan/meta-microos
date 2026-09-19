SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python314-PyMeeus-0.5.12-4.5.noarch.rpm"
RPM_HASH = "6e26f461253db5660e67d294695ee9fa3e7d5a6387480a947fb1eeb849e7d00aaa1f6422c7327e4eb7658e8c4489d22e531d247c272376416ac40f192c36f1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymeeus \
python314-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
