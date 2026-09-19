SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python313-jupyter-packaging-0.12.3-4.8.noarch.rpm"
RPM_HASH = "f3bfa999ca384c487f12110cf70b0ce719aa98f11514c55d3652fd53241c269b074961d42110ad1664a15d270dc7eaab8eadc72a73d6bd5a3863289297cfad45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-packaging \
python3.13dist-jupyter-packaging \
python313-jupyter-packaging \
python3dist-jupyter-packaging"

RDEPENDS:${PN} += "python-abi \
python313-deprecation \
python313-packaging \
python313-setuptools \
python313-tomlkit \
python313-wheel"

inherit rpm
