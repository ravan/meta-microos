SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-purview-nspkg-2.0.0-3.9.noarch.rpm"
RPM_HASH = "5976865e702b94c1b81fe4c25b5faf8a7ed9543cbf601760033f111b2cae7096a2fee6a718a7b8b2bfcc6937817f9045b90da778f6eaa65b15fc8b481aff286e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-nspkg \
python314-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
