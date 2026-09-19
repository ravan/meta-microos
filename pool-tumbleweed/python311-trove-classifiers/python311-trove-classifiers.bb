SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2026.6.1.19"

RPM_NAME = "python311-trove-classifiers-2026.6.1.19-1.1.noarch.rpm"
RPM_HASH = "1fdef98ae6db6d80dfe463c5befc924c4ae6c82be1d2de8fc0bd21fc98a51ff8177cc3974486a63f4ec887327a3cf9a3a3bf6fae60c94f5f9bd3b66f1cf43866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trove-classifiers \
python311-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
