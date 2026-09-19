SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python313-poetry-2.4.1-1.2.noarch.rpm"
RPM_HASH = "eca8cec4d545ab8ec478aa27dbbd1b14e27ff7525f2a39060fdb0dd85d9940938be0fc19588f3eeef544f339b74b4746d263c3d95ed9aeb41aaaf9a33d0179bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry \
python3.13dist-poetry \
python313-poetry \
python3dist-poetry"

RDEPENDS:${PN} += "-python313-build >= 1.2.1 with python313-build < 2.0.0 \
-python313-cachecontrol >= 0.14.0 with python313-cachecontrol < 0.15.0 \
-python313-cleo >= 2.1.0 with python313-cleo < 3.0.0 \
-python313-dulwich >= 0.25.0 with python313-dulwich < 2 \
-python313-fastjsonschema >= 2.18.0 with python313-fastjsonschema < 3.0.0 \
-python313-findpython >= 0.6.2 with python313-findpython < 0.9.0 \
-python313-httpx >= 0.27.0 with python313-httpx < 1 \
-python313-installer >= 0.7.0 with python313-installer < 2.0.0 \
-python313-keyring >= 25.1.0 with python313-keyring < 26.0.0 \
-python313-pkginfo >= 1.12 with python313-pkginfo < 2.0 \
-python313-platformdirs >= 3.0.0 with python313-platformdirs < 5 \
-python313-pyproject-hooks >= 1.0.0 with python313-pyproject-hooks < 2.0.0 \
-python313-requests >= 2.26 with python313-requests < 3.0 \
-python313-requests-toolbelt >= 1.0.0 with python313-requests-toolbelt < 2.0.0 \
-python313-shellingham >= 1.5 with python313-shellingham < 2.0 \
-python313-tomlkit >= 0.11.4 with python313-tomlkit < 1.0.0 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-filelock \
python313-packaging \
python313-pbs-installer \
python313-poetry-core \
python313-trove-classifiers \
python313-virtualenv \
python313-zstandard \
update-alternatives"

inherit rpm
