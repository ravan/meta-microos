SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-security-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "ff22138abb38988e730b7b4216fe9b4e1b3744c8b2293acc87ff1708b10993a8680d354a261cfe6fd91db98cc9a80dc4f4426fecf5029ca47977db976bb26c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-security-nspkg \
python3.13dist-azure-security-nspkg \
python313-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
