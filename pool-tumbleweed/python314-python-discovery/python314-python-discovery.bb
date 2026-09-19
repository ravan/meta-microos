SUMMARY = "Python interpreter discovery"
DESCRIPTION = "`python-discovery` is a library for discovering Python interpreters installed on your machine. You may have multiple \
Python versions from system packages, pyenv, mise, asdf, uv, or the Windows registry (PEP 514). This library finds \
the right one for you. \
 \
Give it a requirement like `python3.12` or `>=3.11,<3.13`, and it searches all known locations, verifies each candidate, \
and returns detailed metadata about the match. Results are cached to disk so repeated lookups are fast."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-python-discovery-1.3.1-1.3.noarch.rpm"
RPM_HASH = "b929d520f02b8f5339ecdd559e554ec701068aef1c3447e343d7db7ff60e20965c0acb65694e2b6d075519e8c613f96d1a96fae1d765fcdc760996e95a34e63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-discovery \
python314-python-discovery \
python3dist-python-discovery"

RDEPENDS:${PN} += "python-abi \
python314-filelock \
python314-platformdirs"

inherit rpm
