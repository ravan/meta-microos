SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.32"

RPM_NAME = "python314-python-multipart-0.0.32-1.3.noarch.rpm"
RPM_HASH = "baed2cf334a095b3fda29ace8f89240639f72e9a27b8f67c4c5d1e767744d25feb0b4d74d6dcc7a938ad291f12ad286b53439c9d0a537a4031e1f78caacb2637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-multipart \
python314-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
