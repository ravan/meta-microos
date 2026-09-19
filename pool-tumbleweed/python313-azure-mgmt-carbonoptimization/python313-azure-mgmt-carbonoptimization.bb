SUMMARY = "Microsoft Azure Carbonoptimization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Carbonoptimization Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-carbonoptimization-1.0.0-1.5.noarch.rpm"
RPM_HASH = "4fb4f25eceea9b3c2d3ab0234dd191a8cd1ff6f601511aa33be524a3f074fa140728c6a747cff6a5c5a0f88c8e7159155d68c27840115dd424a1cceb3f86e704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-carbonoptimization \
python3.13dist-azure-mgmt-carbonoptimization \
python313-azure-mgmt-carbonoptimization \
python3dist-azure-mgmt-carbonoptimization"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
