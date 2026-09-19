SUMMARY = "Hatch plugin for configuring 'variants' of dependencies"
DESCRIPTION = "Hatch plugin for configuring 'variants' of dependencies according to an environment variable. \
This can be used e.g. to change the package dependencies for conda-forge vs PyPI builds."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-hatch-deps-selector-0.1.2-1.1.noarch.rpm"
RPM_HASH = "046535b9982679d3a6710d5e1d21d99a1587a4540f83d98f8113429b2d3aa66489ad70f8e752854ccde58e4ca430794b2b8e312904fe1be34761f9019017b302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-deps-selector \
python314-hatch-deps-selector \
python3dist-hatch-deps-selector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
