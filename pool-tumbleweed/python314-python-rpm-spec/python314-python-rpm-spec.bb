SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python314-python-rpm-spec-0.17.0-2.1.noarch.rpm"
RPM_HASH = "9d92e02734cc9e448563d159ae2ac5483a33eb61e708a668c28e02a824254f8cfd93dca3262d6d6966da0e5f9b032730e00c123a46f5ee53b8fd18c420adbf91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-rpm-spec \
python314-python-rpm-spec \
python3dist-python-rpm-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
