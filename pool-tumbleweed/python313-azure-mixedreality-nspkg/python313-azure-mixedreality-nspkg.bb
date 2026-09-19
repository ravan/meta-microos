SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mixedreality-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "6d77a958b440f1999a039a4581d79d8d06094b27fa0e23212a6e0281eb6ab69c156d704e08e4187b2e6258405e66ac3d5ac9f35ba743d8f6b32fc4637b0462a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-nspkg \
python3.13dist-azure-mixedreality-nspkg \
python313-azure-mixedreality-nspkg \
python3dist-azure-mixedreality-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
