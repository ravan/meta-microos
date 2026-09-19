SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python314-PyScreeze-1.0.1-1.2.noarch.rpm"
RPM_HASH = "f668a15c48dab7af93c547fda25bc8e5e7120b299b875a93afa6f20036ff3448ad0cb7bd5c4c013c6f0da20ff8a6ee34b86cba372ed5193f733b2cf084ba32d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyscreeze \
python314-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python314-Pillow"

inherit rpm
