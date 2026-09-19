SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mixedreality-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "c2734ed3b67979270e0d26dc89200bfb2d7f9856490215afc553bbbc7d93affebd8a9e259e6bbaeb8a8ab34b7ccdb929f313ff12661ca9872f6c8c7ba29fe71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mixedreality-nspkg \
python314-azure-mixedreality-nspkg \
python3dist-azure-mixedreality-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
