SUMMARY = "Python interpreter discovery"
DESCRIPTION = "`python-discovery` is a library for discovering Python interpreters installed on your machine. You may have multiple \
Python versions from system packages, pyenv, mise, asdf, uv, or the Windows registry (PEP 514). This library finds \
the right one for you. \
 \
Give it a requirement like `python3.12` or `>=3.11,<3.13`, and it searches all known locations, verifies each candidate, \
and returns detailed metadata about the match. Results are cached to disk so repeated lookups are fast."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-python-discovery-1.3.1-1.3.noarch.rpm"
RPM_HASH = "8c61ac776e38c7efc9a0e525bfa1aad866196ed0d6892620dda4cd2030963535489eed37680101b6a32d15df56712f04c7cd7cfb31aa5423c4572b90f3b362a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-discovery \
python3.13dist-python-discovery \
python313-python-discovery \
python3dist-python-discovery"

RDEPENDS:${PN} += "python-abi \
python313-filelock \
python313-platformdirs"

inherit rpm
