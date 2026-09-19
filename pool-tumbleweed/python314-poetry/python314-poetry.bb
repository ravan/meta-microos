SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python314-poetry-2.4.1-1.2.noarch.rpm"
RPM_HASH = "83ef54d2420aac55b87fe6ebc87eb034439b931fa669dd2580cc157c2ac1118662d6299582ad87bd3c20aa91dd9a590d1da86776ce9653f72177756bb25ed05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-poetry \
python314-poetry \
python3dist-poetry"

RDEPENDS:${PN} += "-python314-build >= 1.2.1 with python314-build < 2.0.0 \
-python314-cachecontrol >= 0.14.0 with python314-cachecontrol < 0.15.0 \
-python314-cleo >= 2.1.0 with python314-cleo < 3.0.0 \
-python314-dulwich >= 0.25.0 with python314-dulwich < 2 \
-python314-fastjsonschema >= 2.18.0 with python314-fastjsonschema < 3.0.0 \
-python314-findpython >= 0.6.2 with python314-findpython < 0.9.0 \
-python314-httpx >= 0.27.0 with python314-httpx < 1 \
-python314-installer >= 0.7.0 with python314-installer < 2.0.0 \
-python314-keyring >= 25.1.0 with python314-keyring < 26.0.0 \
-python314-pkginfo >= 1.12 with python314-pkginfo < 2.0 \
-python314-platformdirs >= 3.0.0 with python314-platformdirs < 5 \
-python314-pyproject-hooks >= 1.0.0 with python314-pyproject-hooks < 2.0.0 \
-python314-requests >= 2.26 with python314-requests < 3.0 \
-python314-requests-toolbelt >= 1.0.0 with python314-requests-toolbelt < 2.0.0 \
-python314-shellingham >= 1.5 with python314-shellingham < 2.0 \
-python314-tomlkit >= 0.11.4 with python314-tomlkit < 1.0.0 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-filelock \
python314-packaging \
python314-pbs-installer \
python314-poetry-core \
python314-trove-classifiers \
python314-virtualenv \
python314-zstandard \
update-alternatives"

inherit rpm
