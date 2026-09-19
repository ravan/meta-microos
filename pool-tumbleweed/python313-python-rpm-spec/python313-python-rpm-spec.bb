SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python313-python-rpm-spec-0.17.0-2.1.noarch.rpm"
RPM_HASH = "9fd0c3041575bd3620e6957e57f7cc1feb240dfd0c73fcb64fdfdc64e60927fc1194f6565340eaa5750953cab0cedd5cb483735976ef9fdea70f1b5efa13fbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-rpm-spec \
python3.13dist-python-rpm-spec \
python313-python-rpm-spec \
python3dist-python-rpm-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
