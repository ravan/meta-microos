SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python314-azure-nspkg-3.0.2-5.9.noarch.rpm"
RPM_HASH = "687e0468e7dcb3d6f26600fe00c9967bf554b85ae3dfe0f307762d5ca7efc84f952497ebc5faa180e9687a96f5c7ff91a2bceeeb497fd01a5d040d70f56bc526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-nspkg \
python314-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
