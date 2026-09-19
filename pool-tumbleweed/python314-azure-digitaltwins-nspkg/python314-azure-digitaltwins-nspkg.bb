SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-digitaltwins-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "7a7573ec6dc68e6bb44dc5c52760d03f77d175943da6bde324a011b088f27664c94018af693b90b11ca8d838a7eff004f8916e548d13fa99d9adfe2c5f0b1bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-digitaltwins-nspkg \
python314-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
