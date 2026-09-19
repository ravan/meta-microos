SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-flit-scm-1.7.0-2.15.noarch.rpm"
RPM_HASH = "3d69e549ca7b22fd6911f8000f9ea030e156b1a97f31acdadcd95aac8a15ee426e02af24e3d3bd42e33f8d243ef4c2434b8024437ae5353919489bd9eb7bb365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flit-scm \
python314-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python314-flit-core \
python314-setuptools-scm"

inherit rpm
