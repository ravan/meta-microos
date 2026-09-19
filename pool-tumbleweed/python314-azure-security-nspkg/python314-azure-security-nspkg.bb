SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-security-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "dfd5e28397030f660d882e7e0840ab252ce95453714ea1a38dc7af8eaa6a62d4be400cf4c8a6a66b5e65a18d04713db82554461dc03a73125783d25bdbe16e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-security-nspkg \
python314-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
