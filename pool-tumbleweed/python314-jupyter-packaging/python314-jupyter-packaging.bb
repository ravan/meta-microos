SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python314-jupyter-packaging-0.12.3-4.8.noarch.rpm"
RPM_HASH = "d8a078a7247246b4b7b659ff2d570ce137af56d4e5af622ec7d04ffd313177404146cc97611863b38f312ff8c71399d594c2e2bb989d5c4867761bd3e423e58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-packaging \
python314-jupyter-packaging \
python3dist-jupyter-packaging"

RDEPENDS:${PN} += "python-abi \
python314-deprecation \
python314-packaging \
python314-setuptools \
python314-tomlkit \
python314-wheel"

inherit rpm
