SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python314-ana-0.06-5.12.noarch.rpm"
RPM_HASH = "21d66ac0dce86cda1482a740f1c3fe51e34d1c5e5890f46862a3264df778d7342bbb19941cff161aab5b820f361ce91989e0a52febf98703cba6d2aff7f063c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ana \
python314-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi"

inherit rpm
