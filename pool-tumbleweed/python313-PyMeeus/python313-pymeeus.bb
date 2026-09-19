SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python313-PyMeeus-0.5.12-4.5.noarch.rpm"
RPM_HASH = "b4774660f769a28931d6410a4cfa65b50fd7d076354f08465513d4346e0af1fea293b9be00a4c4badcde315e1eeff289b0ff8921c8b99a992d0e53065a896607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeeus \
python3.13dist-pymeeus \
python313-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
