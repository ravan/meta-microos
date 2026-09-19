SUMMARY = "Hatch plugin for configuring 'variants' of dependencies"
DESCRIPTION = "Hatch plugin for configuring 'variants' of dependencies according to an environment variable. \
This can be used e.g. to change the package dependencies for conda-forge vs PyPI builds."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-hatch-deps-selector-0.1.2-1.1.noarch.rpm"
RPM_HASH = "54258df746441bf617551726df8c33179cccf4398f819c9a2b00d5ebca294887b67b36336f8ddb60b0fc1261ebe05da47833916a7471e22e90073999ecb43c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-deps-selector \
python3.13dist-hatch-deps-selector \
python313-hatch-deps-selector \
python3dist-hatch-deps-selector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
