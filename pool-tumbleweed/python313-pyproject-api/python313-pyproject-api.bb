SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python313-pyproject-api-1.10.0-1.6.noarch.rpm"
RPM_HASH = "9145b6b44a3cf2d03832627029f98f6cb734ce5e94601f305927da707aff7d3811bc97ede148b362c15284ed265cd5d2085b3904d90741e2e4589c1f63262296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-api \
python3.13dist-pyproject-api \
python313-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
