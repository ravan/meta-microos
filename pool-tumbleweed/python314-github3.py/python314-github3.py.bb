SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python314-github3.py-4.0.1-2.3.noarch.rpm"
RPM_HASH = "243b1b38481cb42b32b81b4c94bb13e6120c73816f5745aeedcf6372a4df9ed9f0ed48ed3866224dc11c8cd21a6c9b047370f183ccb90f84ce757acd1c07f834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-github3.py \
python314-github3.py \
python3dist-github3.py"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-jwcrypto \
python314-python-dateutil \
python314-requests \
python314-uritemplate"

inherit rpm
