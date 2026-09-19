SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2026.6.1.19"

RPM_NAME = "python314-trove-classifiers-2026.6.1.19-1.1.noarch.rpm"
RPM_HASH = "e269b72eb0f6947ae2f97a4e41ddead814cf5deedd41ec3d04127a55ca87dc66f4cb9748d708d7bb1211e84dee5839750d599e61c87a13d612bf3a8d4ac107c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trove-classifiers \
python314-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
