SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2026.6.1.19"

RPM_NAME = "python313-trove-classifiers-2026.6.1.19-1.1.noarch.rpm"
RPM_HASH = "ad1ed806f98344574695201ea3cc944f737ed6fefbcdc4556e440954267215ff8a2fd065d5e8344052294dba36447f88ef6fdb426f6b8b96d4beba2dacae5a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trove-classifiers \
python3.13dist-trove-classifiers \
python313-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
