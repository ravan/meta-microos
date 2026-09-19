SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2026.6.1.19"

RPM_NAME = "python312-trove-classifiers-2026.6.1.19-1.1.noarch.rpm"
RPM_HASH = "fa315617f2198f7c6a8e6855b672127e7c660bc738b2aaeef35b8f9d6469e3215676ceaa07372d7eb027a9fdc06d9f687a458b5c0fce876372949fe783c17af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-trove-classifiers \
python312-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
